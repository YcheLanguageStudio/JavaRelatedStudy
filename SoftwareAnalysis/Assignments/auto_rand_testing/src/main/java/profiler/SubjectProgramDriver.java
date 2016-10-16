package profiler;

import profiler.demo.InvokeStaticInstrumenter;
import soot.Main;
import soot.Pack;
import soot.PackManager;
import soot.Transform;

public class SubjectProgramDriver {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java SubjectProgramDriver [options] classname");
            System.exit(0);
        }

        Pack jtp = PackManager.v().getPack("jtp");
        jtp.add(new Transform("jtp.yche_instrumenter", new CovergageInstrumentor()));

        System.out.println("Driver Parameters:");
        for (String arg : args) {
            System.out.print(arg + "\t");
        }
        System.out.println();

        Main.main(args);
        System.out.println("Soot-----------End");
    }
}