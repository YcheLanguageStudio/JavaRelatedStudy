package profiler.demo;

import java.io.IOException;

public class MyCounter {
    private static int c = 0;

    public static synchronized void increase(int howmany) {
        c += howmany;
    }

    public static synchronized void report() {
        System.out.println("counter : " + c);
    }

    public static synchronized void display() {
        System.out.println("display");
    }

    public static synchronized void mark(int index) {
        System.out.println("mark" + index);
    }
}