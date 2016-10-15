package profiler.xie_min;

import soot.*;

public class MainDriver_sort {
    public static void main(String[] args) {
        instructmentSort();

    }

    public static void instructmentSort() {
        Pack jtp = PackManager.v().getPack("jtp");
        jtp.add(new Transform("jtp.instrumenter", new SortInstucmenter()));

        String[] argSort = {"-soot-classpath", "../A1/bin", "tests.Sort"};

        for (String arg : argSort) {
            System.out.println(arg);
        }

        Main.main(argSort);
    }
}