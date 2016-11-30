package profiler;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.jimple.internal.JIfStmt;
import soot.util.Chain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class CovergageInstrumentor extends BodyTransformer {
    static SootClass markerClass;
    static SootMethod reportFunc, markStmtFunc, markIfFunc, markBranchFunc, reportCodeCoverageFunc;
    static HashMap<String, Integer> nameIndexMap;
    static int branchCount;

    static {
        branchCount = 0;
        nameIndexMap = new HashMap<>();
        markerClass = Scene.v().loadClassAndSupport("profiler.StatementMarker");
        reportFunc = markerClass.getMethod("void report()");
        reportCodeCoverageFunc = markerClass.getMethod("void report()");
        markStmtFunc = markerClass.getMethod("void markStatement(java.lang.String,int)");
        markIfFunc = markerClass.getMethod("void markIfStatement(java.lang.String,int)");
        markBranchFunc = markerClass.getMethod("void markBranch(java.lang.String,int)");
        Scene.v().setSootClassPath(null);
    }

    protected void insertReportIfNotInit(SootMethod method, Chain units) {
        System.out.println(method.toString());
        String signature = method.getSubSignature();
        boolean isInit = signature.equals("void <init>()");
        if (!isInit) {
            for (Iterator stmtIt = units.snapshotIterator(); stmtIt.hasNext(); ) {
                Stmt stmt = (Stmt) stmtIt.next();
                if ((stmt instanceof ReturnStmt) || (stmt instanceof ReturnVoidStmt)) {
                    InvokeExpr reportExpr = Jimple.v().newStaticInvokeExpr(reportCodeCoverageFunc.makeRef());
                    Stmt reportStmt = Jimple.v().newInvokeStmt(reportExpr);
                    units.insertBefore(reportStmt, stmt);
                }
            }
        }
    }

    protected void internalTransform(Body body, String phase, Map options) {
        SootMethod method = body.getMethod();
        Chain units = body.getUnits();
        String className = body.getMethod().getDeclaringClass().toString();
        System.out.println("Instrumenting Method Body: " + body.getMethod().getSignature());

        for (Iterator stmtIt = units.snapshotIterator(); stmtIt.hasNext(); ) {
            Stmt stmt = (Stmt) stmtIt.next();

            if (!(stmt instanceof JIdentityStmt)) {
                if (!nameIndexMap.containsKey(className)) {
                    nameIndexMap.put(className, -1);
                }
                nameIndexMap.put(className, nameIndexMap.get(className) + 1);
                InvokeExpr markExpr = Jimple.v().newStaticInvokeExpr(markStmtFunc.makeRef(),
                        StringConstant.v(className), IntConstant.v(nameIndexMap.get(className)));
                Stmt markStmt = Jimple.v().newInvokeStmt(markExpr);
                units.insertBefore(markStmt, stmt);

                markExpr = Jimple.v().newStaticInvokeExpr(markBranchFunc.makeRef(),
                        StringConstant.v(className), IntConstant.v(nameIndexMap.get(className)));
                markStmt = Jimple.v().newInvokeStmt(markExpr);
                units.insertBefore(markStmt, stmt);
            }

            if (stmt instanceof JIfStmt) {
                System.out.println(((JIfStmt) stmt).getTarget().toString());
                branchCount++;
                InvokeExpr markExpr = Jimple.v().newStaticInvokeExpr(markIfFunc.makeRef(),
                        StringConstant.v(className), IntConstant.v(nameIndexMap.get(className)));
                Stmt markStmt = Jimple.v().newInvokeStmt(markExpr);
                units.insertBefore(markStmt, stmt);
            }
        }

        try {
            File file = new File(className + "_" + "statements_num.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(Integer.toString(nameIndexMap.get(className) + 1));
            writer.close();
            file = new File(className + "_" + "branches_num.txt");
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(Integer.toString(branchCount * 2));
            writer.close();
        } catch (Exception e) {

        }
        insertReportIfNotInit(method, units);
    }
}
