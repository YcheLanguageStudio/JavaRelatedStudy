package profiler.demo;

import soot.*;

public class MainDriver {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java MainDriver [options] classname");
            System.exit(0);
        }

        Pack jtp = PackManager.v().getPack("jtp");
        jtp.add(new Transform("jtp.instrumenter", new InvokeStaticInstrumenter()));

        System.out.println("Driver Parameters:");
        for (String arg : args) {
            System.out.print(arg + "\t");
        }
        System.out.println();

        soot.Main.main(args);
        System.out.println("Soot-----------End");
    }
}