package profiler;

import java.io.IOException;

public class MyCounter {
    private static int c = 0;
    private static int id = 0;

    public static synchronized void increase(int howmany) {
        c += howmany;
    }

    public static synchronized void report() {
        System.out.println("counter : " + c);
    }

    public static synchronized void display() {
        System.out.println("display");
    }

    public static synchronized void mark() {
        System.out.println("mark");
    }
}