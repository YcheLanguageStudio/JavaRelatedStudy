package profiler;

public class MyCounter {
    private static int c = 0;

    public static synchronized void increase(int howmany) {
        c += howmany;
    }

    public static synchronized void report() {
        System.out.println("counter : " + c);
    }
}