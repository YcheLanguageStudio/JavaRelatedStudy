package profiler;

import soot.*;
import soot.jimple.*;
import soot.util.*;

import java.util.*;

public class InvokeStaticInstrumenter extends BodyTransformer {

    static SootClass counterClass;
    static SootMethod increaseCounter, reportCounter;

    static {
        counterClass = Scene.v().loadClassAndSupport("profiler.MyCounter");
        increaseCounter = counterClass.getMethod("void increase(int)");
        reportCounter = counterClass.getMethod("void report()");
        Scene.v().setSootClassPath(null);
    }


    protected void internalTransform(Body body, String phase, Map options) {

        SootMethod method = body.getMethod();
        Chain units = body.getUnits();
        Iterator stmtIt = units.snapshotIterator();

        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(body.toString());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println("instrumenting method : " + method.getSignature() + "\t//current Phase:" + phase + ", current options:" + options);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (stmtIt.hasNext()) {
            Stmt stmt = (Stmt) stmtIt.next();
            System.out.println(stmt.toString());
            if (!stmt.containsInvokeExpr()) {
                continue;
            }
            InvokeExpr expr = (InvokeExpr) stmt.getInvokeExpr();
            if (!(expr instanceof StaticInvokeExpr)) {
                continue;
            }

            InvokeExpr incExpr = Jimple.v().newStaticInvokeExpr(increaseCounter.makeRef(), IntConstant.v(1));
            Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);
            units.insertBefore(incStmt, stmt);
        }

        String signature = method.getSubSignature();
        boolean isMain = signature.equals("void main(java.lang.String[])");
        if (isMain) {
            System.out.println("Got Main ~~~~~~~~~");
            stmtIt = units.snapshotIterator();
            while (stmtIt.hasNext()) {
                Stmt stmt = (Stmt) stmtIt.next();
                if ((stmt instanceof ReturnStmt) || (stmt instanceof ReturnVoidStmt)) {
                    InvokeExpr reportExpr = Jimple.v().newStaticInvokeExpr(reportCounter.makeRef());
                    Stmt reportStmt = Jimple.v().newInvokeStmt(reportExpr);
                    units.insertBefore(reportStmt, stmt);
                }
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
