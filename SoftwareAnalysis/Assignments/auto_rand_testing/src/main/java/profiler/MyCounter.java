package profiler;

import java.io.IOException;

public class MyCounter {
    private static int c = 0;

    public static synchronized void increase(int howmany) {
        c += howmany;
    }

    public static synchronized void report() {
        System.out.println("counter : " + c);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}