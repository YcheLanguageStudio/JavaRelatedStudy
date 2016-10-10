/**
 * Created by cheyulin on 9/5/16.
 */
public class Cyphers {
    /**
     * Up shift each character of the input string by 7 in the English alphabetic.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment01(String s) {
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            ca[i] = (char) (ca[i] + 7);
            if (ca[i] > 'z') {
                ca[i] = (char) (ca[i] - 'z' + 'a' - 1);
            }
        }
        return new String(ca);
    }

    /**
     * Up shift each character of the input string by 3 between the range of '0' and '~' (tilde).
     *
     * @param s
     * @return
     */
    public String captureCodeFragment02(String s) {
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            ca[i] = (char) (ca[i] + 3);
            if (ca[i] > '~') {
                ca[i] = (char) (ca[i] - '~' + '0' - 1);
            }
        }
        return new String(ca);
    }

    /**
     * Up shift each character of the input string by 4 times index value plus 1 in the English
     * alphabetic.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment03(String s) {
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            ca[i] = (char) (ca[i] + 1 + 4 * i);
            while (ca[i] > 'z') {
                ca[i] = (char) (ca[i] - 'z' + 'a' - 1);
            }
        }
        return new String(ca);
    }

    /**
     * Up shift each character of the input string by 3 different values according to the index value
     * in the English alphabetic.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment04(String s) {
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            int remainder = i % 4;
            int offset = remainder < 2 ? remainder + 2 : 19;
            ca[i] = (char) (ca[i] + offset);
            if (ca[i] > 'z') {
                ca[i] = (char) (ca[i] - 'z' + 'a' - 1);
            }
        }
        return new String(ca);
    }
}
