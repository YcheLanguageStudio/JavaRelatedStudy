//package profiler.xie_min;
//
//import java.util.*;
//
//import soot.*;
//import soot.jimple.*;
//import soot.jimple.internal.JIdentityStmt;
//import soot.util.*;
//
//
//public class TestInstucmenter extends BodyTransformer {
//
//    static SootClass counterClass;
//    static SootMethod reportCounter;
//    static SootMethod endlCounter;
//
//    static {
//        counterClass = Scene.v().loadClassAndSupport("MyCounter");
//        reportCounter = counterClass.getMethod("void report()");
//        endlCounter = counterClass.getMethod("void endl()");
//        Scene.v().setSootClassPath(null);
//    }
//
//    protected void internalTransform(Body body, String phase, Map options) {
//
//        SootMethod m = body.getMethod();
//        Chain units = body.getUnits();
//        Iterator stmtIt = units.snapshotIterator();
//
//        boolean isInit = m.getName().contains("<init>");
//
//        if (!isInit) {
//            System.out.println("Instructmenting " + m.getName());
//            // label0:
//            //   ... (method body -- before final return)
//            // label1:
//            //   goto label3
//            // label2:
//            //   local1 := @caughtexception;
//            //   local1.printStackTrace(System.out);
//            // label3:
//            //   return  (end of old method body)
//            //
//            // catch java.lang.Throwable from label0 to label1 with label2;
//
//            // get access to Throwable class and toString method
//            SootClass thrwCls = Scene.v().getSootClass("java.lang.Throwable");
//            SootMethod mPrintStackTrace = thrwCls.getMethod("void printStackTrace(java.io.PrintStream)");
//
//            // get access to System.out field
//            //SootClass clsSystem = Scene.v().getSootClass("java.lang.System");
//            //SootClass clsPrintStream = Scene.v().getSootClass("java.io.PrintStream");
//            //Type printStreamType = clsPrintStream.getType();
//            //SootField fldSysOut = clsSystem.getField("out", printStreamType);
//            //SootClass clsSystem = Scene.v().getSootClass("Myhelper");
////				SootMethod mPrintln = clsPrintStream.getMethod("void println(java.lang.String)");
//
//
//            // create probe from label1 to label3 (excluding return)
//            List<Stmt> probe = new ArrayList<Stmt>();
//            Body b = m.retrieveActiveBody();
//            PatchingChain<Unit> pchain = b.getUnits();
//
//            Stmt sFirstNonId = UtilInstrum.getFirstNonIdStmt(pchain);
//            Stmt sLast = (Stmt) pchain.getLast();
//
//
//            // FOR NOW, no other returns allowed apart from last stmt
//            for (Unit u : pchain)
//                assert (!(u instanceof ReturnStmt) && !(u instanceof RetStmt)) || u == sLast;
//
//
//            // label1:
//            //   goto label3
//            Stmt sGotoLast = Jimple.v().newGotoStmt(sLast);
//            probe.add(sGotoLast);
//            // label2:
//            //   local1 := @caughtexception;
//            Local lException1 = UtilInstrum.getCreateLocal(b, "<ex1>", RefType.v(thrwCls));
//            Stmt sCatch = Jimple.v().newIdentityStmt(lException1, Jimple.v().newCaughtExceptionRef());
//            probe.add(sCatch);
////					//   local2 := local1.toString();
////					Local lThrwMessage = UtilInstrum.getCreateLocal(b, "<ex2>", RefType.v("java.lang.String"));
////					Stmt sThrwToString = Jimple.v().newAssignStmt(lThrwMessage,
////							Jimple.v().newVirtualInvokeExpr(lException1, mPrintStackTrace.makeRef()));
////					probe.add(sThrwToString);
////					//   System.out.println(local2);
//
//            //   local1.printStackTrace(System.out);
//            //Local lSysOut = UtilInstrum.getCreateLocal(b, "<sysout>", printStreamType);
//            //Stmt sGetSysOutToLocal = Jimple.v().newAssignStmt(lSysOut, Jimple.v().newStaticFieldRef(fldSysOut.makeRef()));
//            //probe.add(sGetSysOutToLocal);
//            //Stmt sCallPrintStackTrace = Jimple.v().newInvokeStmt(Jimple.v().newVirtualInvokeExpr(lException1, mPrintStackTrace.makeRef(),lSysOut));
//            //probe.add(sCallPrintStackTrace);
//            InvokeExpr reportExpr = Jimple.v().newStaticInvokeExpr(
//                    reportCounter.makeRef());
//            //System.out.println("# nodes : " + statementCount);
//            // 2. then, make a invoke statement
//            Stmt reportStmt = Jimple.v().newInvokeStmt(reportExpr);
//            probe.add(reportStmt);
//
//            InstrumManager.v().insertRightBeforeNoRedirect(pchain, probe, sLast);
//
//            // insert trap (catch)
//            b.getTraps().add(Jimple.v().newTrap(thrwCls, sFirstNonId, sGotoLast, sCatch));
//
////					// DEBUG
////					System.out.println(m.getName() + ":");
////					System.out.println(pchain);
//            stmtIt = units.snapshotIterator();
//            while (stmtIt.hasNext()) {
//                Stmt stmt = (Stmt) stmtIt.next();
//
//                //System.out.println(stmt.hashCode() + "\n " + stmt.toString());
//
//                if ((stmt instanceof ReturnStmt) || (stmt instanceof ReturnVoidStmt)) {
//                    // 1. make invoke expression of MyCounter.report()
//                    InvokeExpr endlExpr = Jimple.v().newStaticInvokeExpr(
//                            endlCounter.makeRef());
//                    //System.out.println("# nodes : " + statementCount);
//                    // 2. then, make a invoke statement
//                    Stmt endlStmt = Jimple.v().newInvokeStmt(endlExpr);
//
//                    // 3. insert new statement into the chain
//                    // (we are mutating the unit chain).
//                    units.insertBefore(endlStmt, stmt);
//                }
//            }
//
//
//        }
//    }
//
//}
