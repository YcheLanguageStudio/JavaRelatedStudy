package profiler;

import profiler.util.DriverUtil;
import soot.Main;
import soot.Pack;
import soot.PackManager;
import soot.Transform;

public class SubjectProgramDriver {
    public static void main(String[] args) {
        DriverUtil.runDriver(args, "jtp.yche_instrumenter", new CovergageInstrumentor());
    }
}