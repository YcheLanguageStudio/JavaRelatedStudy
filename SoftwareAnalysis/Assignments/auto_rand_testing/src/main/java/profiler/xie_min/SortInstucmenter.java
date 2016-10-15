package profiler.xie_min;

import java.util.*;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.util.*;

public class SortInstucmenter extends BodyTransformer {

    static SootClass counterClass;
    static SootMethod increaseCounter, writeCounter;

    static {
        counterClass = Scene.v().loadClassAndSupport("MyCounter");
        increaseCounter = counterClass.getMethod("void increase(java.lang.String,int)");
        writeCounter = counterClass.getMethod("void write()");
        Scene.v().setSootClassPath(null);
    }

    protected void internalTransform(Body body, String phase, Map options) {
        SootMethod method = body.getMethod();
        Chain units = body.getUnits();
        Iterator stmtIt = units.snapshotIterator();

        boolean isInit = method.getName().contains("<init>");

        if (!isInit) {
            System.out.println("instrumenting method : " + method.getSignature());

            while (stmtIt.hasNext()) {
                Stmt stmt = (Stmt) stmtIt.next();
                if (!(stmt instanceof JIdentityStmt) && !stmt.toString().contains("MyCounter: void increase")) {
                    InvokeExpr markExpr = Jimple.v().newStaticInvokeExpr(increaseCounter.makeRef(),
                            StringConstant.v(method.getSignature() + " " +
                                    stmt.toString()), IntConstant.v(stmt.hashCode()));
                    Stmt markStmt = Jimple.v().newInvokeStmt(markExpr);
                    units.insertBefore(markStmt, stmt);
                }
            }

            stmtIt = units.snapshotIterator();
            while (stmtIt.hasNext()) {
                Stmt stmt = (Stmt) stmtIt.next();
                if ((stmt instanceof ReturnStmt) || (stmt instanceof ReturnVoidStmt)) {
                    InvokeExpr reportExpr = Jimple.v().newStaticInvokeExpr(writeCounter.makeRef());
                    Stmt reportStmt = Jimple.v().newInvokeStmt(reportExpr);
                    units.insertBefore(reportStmt, stmt);
                }
            }
        }
    }
}
