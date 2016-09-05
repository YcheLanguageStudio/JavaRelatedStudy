/**
 * Created by cheyulin on 9/5/16.
 */
public class Arithmetic {
    public static int Puzzle0(int x) {
        return -x;
    }

    public static int Puzzle1(int x) {
        return x - 2;
    }

    public static int Puzzle2(int x) {
        return x * x;
    }

    public static int Puzzle3(int x) {
        return 3 * x;
    }

    public static int Puzzle4(int x) {
        return x / 3;
    }

    public static int Puzzle5(int x) {
        return 4 / x;
    }

    public static int Puzzle6(int x, int y) {
        return x - y;
    }

    public static int Puzzle7(int x, int y) {
        return x + 2 * y;
    }

    public static int Puzzle8(int x, int y) {
        return x * y;
    }

    public static int Puzzle9(int x, int y) {
        return x + y / 3;
    }

    public static int Puzzle10(int x, int y) {
        return x / y;
    }

    public static int Puzzle11(int x) {
        return x % 3;
    }

    //-4 mod 3 == -1
    public static int Puzzle12(int x) {
        return x % 3 + 1;
    }

    public static int Puzzle13(int x) {
        return 10 % 3;
    }

    public static int Puzzle14(int x, int y, int z) {
        return (x + y + z) % 3;
    }
}
