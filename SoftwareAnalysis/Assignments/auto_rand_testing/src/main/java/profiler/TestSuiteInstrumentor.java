package profiler;

import soot.*;
import soot.util.*;

import java.util.*;

/**
 * Created by cheyulin on 10/16/16.
 */

public class TestSuiteInstrumentor extends BodyTransformer {

    @Override
    protected void internalTransform(Body body, String s, Map map) {
        SootMethod m = body.getMethod();
        Chain units = body.getUnits();
        Iterator stmtIt = units.snapshotIterator();

        boolean isInit = m.getName().contains("<init>");

        if (!isInit) {

        }
    }
}
