package profiler;

import profiler.util.DriverUtil;


/**
 * Created by cheyulin on 10/16/16.
 */

public class TestSuiteDriver {
    public static void main(String[] args) {
        DriverUtil.runDriver(args, "jtp.yche_testsuite_instrumenter", new TestSuiteInstrumentor());
    }
}
