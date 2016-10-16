package profiler.demo_xiemin;

import soot.*;

public class MainDriver_sort {
    public static void main(String[] args) {
        Pack jtp = PackManager.v().getPack("jtp");
        jtp.add(new Transform("jtp.instrumenter", new SortInstucmenter()));

        for (String arg : args) {
            System.out.println(arg);
        }

        Main.main(args);
    }

}