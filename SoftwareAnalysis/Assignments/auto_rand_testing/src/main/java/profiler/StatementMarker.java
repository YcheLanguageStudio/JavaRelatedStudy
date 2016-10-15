package profiler;

import java.io.IOException;

/**
 * Created by cheyulin on 10/15/16.
 */

public class StatementMarker {
    private static int[] mark_arr = null;
    private static int id = 0;

    public static synchronized void initStatements(int size) {
        mark_arr = new int[size];
        for (int i = 0; i < size; i++) {
            mark_arr[i] = 0;
        }
    }

    public static synchronized void markStatement(int index) {
        mark_arr[index]++;
    }

    public static synchronized void incrementIid() {
        id += 1;
    }

    public static synchronized void report() {
    }
}
