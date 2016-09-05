/**
 * Created by cheyulin on 9/5/16.
 */

public class Conditionals2 {
    /**
     * Determine the length of input string.<br>
     * <i>short</i> - less than 4 characters<br>
     * <i>average</i> - less than 8 characters<br>
     * <i>long</i> - less than 15 characters<br>
     * <i>super long</i> - bigger than 14 characters<br>
     *
     * @param s
     * @return
     */
    public String captureCodeFragment01(String s) {
        int l = s.length();
        return l < 4 ? "short" : l < 8 ? "average" : l < 15 ? "long" : "super long";
    }

    /**
     * Is it fancy year? It will be determined in case of input number.<br>
     * Fancy years are years that have all the same numbers.<br>
     * Fancy years are never less than 1000 and never bigger than 9999.<br>
     *
     * @param i
     * @return
     */
    public String captureCodeFragment02(int i) {
        return 999 < i && i < 10000 && i % 1111 == 0 ? "fancy year" : "not a fancy year";
    }

    /**
     * Are a, b, c the sides of a right angle triangle?
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public Boolean captureCodeFragment03(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0
                && (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b);
    }

    /**
     * Sum of absolute values of input values.
     *
     * @param x
     * @param y
     * @return
     */
    public int captureCodeFragment04(int x, int y) {
        return Math.abs(x) + Math.abs(y);
    }

    /**
     * Is i square equal with j?
     *
     * @param i
     * @param j
     * @return
     */
    public Boolean captureCodeFragment05(int i, int j) {
        return i * i == j;
    }

}
