package profiler;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.util.Chain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CovergageInstrumentor extends BodyTransformer {
    static SootClass markerClass;
    static SootMethod reportCounter, displayCounter, markCounter;
    static HashMap<String, Integer> nameIndexMap;

    static {
        nameIndexMap = new HashMap<>();
        markerClass = Scene.v().loadClassAndSupport("profiler.StatementMarker");
        reportCounter = markerClass.getMethod("void report()");
        displayCounter = markerClass.getMethod("void display()");
        markCounter = markerClass.getMethod("void mark(java.lang.String,int)");
        Scene.v().setSootClassPath(null);
    }

    protected void internalTransform(Body body, String phase, Map options) {
        SootMethod method = body.getMethod();
        Chain units = body.getUnits();
        String className = body.getMethod().getDeclaringClass().toString();
        System.out.println("Instrumenting Method Body: " + body.getMethod().getSignature());
        if (className.equals("util_test.RegressionTest")) {
            System.out.println(body.toString());
        }

        for (Iterator stmtIt = units.snapshotIterator(); stmtIt.hasNext(); ) {
            Stmt stmt = (Stmt) stmtIt.next();
            if (!(stmt instanceof JIdentityStmt)) {
                if (!nameIndexMap.containsKey(className)) {
                    nameIndexMap.put(className, -1);
                }

                nameIndexMap.put(className, nameIndexMap.get(className) + 1);
                InvokeExpr markExpr = Jimple.v().newStaticInvokeExpr(markCounter.makeRef(),
                        StringConstant.v(className), IntConstant.v(nameIndexMap.get(className)));
                Stmt markStmt = Jimple.v().newInvokeStmt(markExpr);
                units.insertBefore(markStmt, stmt);
            }
        }
    }
}
