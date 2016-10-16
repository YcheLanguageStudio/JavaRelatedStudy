package profiler.util;

import soot.*;

/**
 * Created by cheyulin on 10/16/16.
 */

public class DriverUtil {
    public static void runDriver(String[] args, String transformPhaseName, BodyTransformer bodyTransformer) {
        if (args.length == 0) {
            System.err.println("Usage: java SubjectProgramDriver [options] classname");
            System.exit(0);
        }

        Pack jtp = PackManager.v().getPack("jtp");
        jtp.add(new Transform(transformPhaseName, bodyTransformer));

        System.out.println("Driver Parameters:");
        for (String arg : args) {
            System.out.print(arg + "\t");
        }
        System.out.println();

        Main.main(args);
        System.out.println("Soot-----------End");
    }
}
