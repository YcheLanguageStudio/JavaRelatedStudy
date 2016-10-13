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

        System.out.println("instrumenting method : " + method.getSignature() + "\t\t\t\t\tcurrent Phase:" + phase + ", current options:" + options);

        while (stmtIt.hasNext()) {
            Stmt stmt = (Stmt) stmtIt.next();
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
    }
}
