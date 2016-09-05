/**
 * Created by cheyulin on 9/5/16.
 */

public class Conditionals {
    public static Boolean Puzzle0(Boolean x, Boolean y) {
        return x || y;
    }

    public static Boolean Puzzle1(Boolean x, Boolean y) {
        return x && y;
    }

    public static Boolean Puzzle2(int x) {
        return x < 50;
    }

    public static Boolean Puzzle3(int x, int y) {
        return x < y;
    }

    public static int Puzzle4(int i) {
        if (i == 0)
            return 0;
        return i > 0 ? 1 : -1;
    }

    public static Boolean Puzzle5(int i, int j) {
        return i > j;
    }

    public static int Puzzle6(int i) {
        return i > 99 ? 3 : 2;
    }

    public static String Puzzle7(int i) {
        return i % 2 == 0 ? "even" : "odd";
    }

    public static String Puzzle8(int i) {
        return (i % 5 == 0 ? "" : "not a ") + "multiple of 5";
    }

    public static String Puzzle9(int i, int x) {
        return (i % x == 0 ? "" : "not a ") + "multiple of " + x;
    }

    public static String Puzzle10(int i, int j, int k) {
        return i > j && Math.pow(j, j) == i && k == 1 ? "yes!" : "no";
    }

    public int Puzzle11(int i) {
        return i < 8 ? 0 : i < 15 ? 7 : 21;
    }
}
