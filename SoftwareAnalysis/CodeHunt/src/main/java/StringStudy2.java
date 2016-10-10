/**
 * Created by cheyulin on 9/5/16.
 */

public class StringStudy2 {
    /**
     * Concatenate the input strings the following order 231132.
     *
     * @param one
     * @param two
     * @param three
     * @return
     */
    public String captureCodeFragment01(String one, String two, String three) {
        return new StringBuilder().append(two).append(three).append(one).append(one).append(three)
                .append(two).toString();
    }

    /**
     * Give back the first half of the input string.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment02(String s) {
        return s.substring(0, s.length() / 2);
    }

    /**
     * Replace the input <b>b</b> string to input <b>b</b> string in the input <b>c</b> string.
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public String captureCodeFragment03(String a, String b, String c) {
        return a.replace(b, c);
    }

    /**
     * Reverse the input string.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment04(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Swapping the characters of the two input string. Even indexes comes from the <b>b</b> input
     * string. Odd indexes comes from the <b>a</b> input string.
     *
     * @param a
     * @param b
     * @return
     */
    public String captureCodeFragment05(String a, String b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (i % 2 == 0) {
                sb.append(b.charAt(i));
            } else {
                sb.append(a.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * Eliminate the space characters.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment06(String s) {
        return s.replace(" ", "");
    }

    /**
     * Eliminate the 'a','e','i','u' and 'o' characters.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment07(String s) {
        return s.replaceAll("[a,e,i,u,o]", "");
    }

    /**
     * Is the input start with <b>a</b>, contains <b>b</b> and end with <b>c</b>?
     *
     * @param input
     * @param a
     * @param b
     * @param c
     * @return
     */
    public Boolean captureCodeFragment08(String input, String a, String b, String c) {
        return input.startsWith(a) && input.contains(b) && input.endsWith(c);
    }

    /**
     * Concatenate s input string by i times and separate every string with a space.
     *
     * @param i
     * @param s
     * @return
     */
    public String captureCodeFragment09(int i, String s) {
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(s);
        }
        for (int j = 1; j < i; j++) {
            sb.append(" " + s);
        }
        return sb.toString();
    }

    /**
     * Very tricky algorithm. Copy the English alphabet t times. In case of t is bigger than 1 then
     * the last sequence will be missing t - 1 characters from before the 'z' character.
     *
     * @param t
     * @return
     */
    // TODO try to improve it
    public String captureCodeFragment10(int t) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            sb.append("a b c d e f g h i j k l m n o p q r s t u v w x y z ");
        }
        return sb.delete(sb.length() - t * 2, sb.length()).append("z").toString();
    }
}
