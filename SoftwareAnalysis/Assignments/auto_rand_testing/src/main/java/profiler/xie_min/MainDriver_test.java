//package profiler.xie_min;
//
//import java.io.File;
//import java.util.ArrayList;
//
//import soot.*;
//
//public class MainDriver_test {
//    public static void main(String[] args) {
//        Pack jtp = PackManager.v().getPack("jtp");
//        jtp.add(new Transform("jtp.instrumenter", new TestInstucmenter()));
//
//        ArrayList<String> arg = new ArrayList<String>();
//
//        File folder = new File("../A1/src/janala");
//
//        for (final File fileEntry : folder.listFiles()) {
//            String temp = fileEntry.getName();
//            String[] name = temp.split("[.]");
//            if (name.length == 2 && name[name.length - 1].toLowerCase().equals("java"))
//                arg.add(name[0]);
//        }
//
//
//        String[] argSort = new String[arg.size() + 2];
//        argSort[0] = "-soot-classpath";
//        argSort[1] = "../A1/bin;../A1/SortGoldenVersion.jar;../A1/junit.jar;../A1/rt.jar;../A1/hamcrest.jar";
//        for (int i = 0; i < arg.size(); i++)
//            argSort[i + 2] = "janala." + arg.get(i);
//        instructmentTest(argSort);
//    }
//
//
//    public static void instructmentTest(String[] argSort) {
//        for (String arg : argSort) {
//            System.out.println(arg);
//        }
//        Main.main(argSort);
//    }
//}