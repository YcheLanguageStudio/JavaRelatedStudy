/**
 * Created by cheyulin on 9/5/16.
 */

public class StringStudy {
    /**
     * Constant false result for every input.
     *
     * @param s
     * @return
     */
    public Boolean captureCodeFragment01(String s) {
        return false;
    }

    /**
     * Capitalize every character of even position of the input string.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment02(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * Capitalize every last character of every word.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment03(String s) {
        // TODO: rewrite with regular expression
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            sb.append(s.charAt(i) != ' ' && s.charAt(i + 1) == ' ' ? Character.toUpperCase(s.charAt(i))
                    : s.charAt(i));
        }
        if (s.length() > 0) {
            sb.append(Character.toUpperCase(s.charAt(s.length() - 1)));
        }
        return sb.toString();
    }

    /**
     * What is the character on the x index of in the input string?
     *
     * @param s
     * @param x
     * @return
     */
    public char captureCodeFragment04(String s, int x) {
        return s.charAt(x);
    }

    /**
     * Concatenate the two input string. The second input string come first.
     *
     * @param one
     * @param two
     * @return
     */
    public String captureCodeFragment05(String one, String two) {
        return two + one;
    }

    /**
     * Give back the second half of the input string.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment06(String s) {
        int e = s.length() / 2;
        return s.substring(e);
    }

    /**
     * Make capitalized the second half of the input string and overwrite the beginning of the input
     * string.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment07(String s) {
        return s.length() > 2 ? s.substring(s.length() / 2 + 1).toUpperCase()
                + s.substring(s.length() / 2) : s;
    }

    /**
     * Return the length of longer input string.
     *
     * @param a
     * @param b
     * @return
     */
    public int captureCodeFragment08(String a, String b) {
        return Math.max(a.length(), b.length());
    }

    /**
     * Return the longer input string. In case of equality return a concatenated string.
     *
     * @param a
     * @param b
     * @return
     */
    public String captureCodeFragment09(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        } else if (a.length() < b.length()) {
            return b;
        } else { // equality
            return a + b;
        }
    }

    /**
     * Return the one-third of the length of the input string.
     *
     * @param s
     * @return
     */
    public int captureCodeFragment10(String s) {
        return s.length() / 3;
    }

    /**
     * That was a very tricky task. Concatenate to substring of the input string.<br>
     * <p>
     * First substring begin form i index to s.length() - 1
     * </p>
     * <p>
     * Second substring begin form j index to s.length() - 1
     * </p>
     *
     * @param i
     * @param j
     * @param s
     * @return
     */
    public String captureCodeFragment11(int i, int j, String s) {
        return s.substring(i, s.length() - 1) + s.substring(j, s.length() - 1);
    }

    /**
     * Return the concatenated of input string and reverse of the input string.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment12(String s) {
        return s + new StringBuilder(s).reverse();
    }
}
