/**
 * Created by cheyulin on 16/9/8.
 */

import java.util.*;

public class TestSet {
    public static void demoCorrect() {
        Set<Short> s = new HashSet<Short>();
        for (short i = 0; i < 100; i++) {
            s.add(i);
            s.remove((short) (i - 1));  //short-valued expression, wrapped into Short
        }
        System.out.println(s.size());
    }

    public static void demoBuggy() {
        Set<Short> s = new HashSet<Short>();
        for (short i = 0; i < 100; i++) {
            s.add(i);
            s.remove(i - 1);  //int-valued expression, wrapped into Integer
        }
        System.out.println(s.size());
    }

    public static void main(String[] args) {
        demoBuggy();
        demoCorrect();
    }
}
