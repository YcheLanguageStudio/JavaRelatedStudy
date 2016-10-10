/**
 * Created by cheyulin on 9/5/16.
 */
public class NestedLoops {
    /**
     * Sum every factorial between i and j.
     *
     * @param i
     * @param j
     * @return
     */
    public int captureCodeFragment01(int i, int j) {
        int sumFactorial = 0;
        for (int k = i; k <= j; k++) {
            sumFactorial += calculateFactorial(k);
        }
        return sumFactorial;
    }

    /**
     * Helper function to calculate the factorial of a number.
     *
     * @param x
     * @return
     */
    public int calculateFactorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * calculateFactorial(x - 1);
    }

    /**
     * Create increasing sequence of '#' character.
     *
     * @param n
     * @return
     */
    public String captureCodeFragment02(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append('#');
            }
            sb.append(' ');
        }
        return sb.toString();
    }

    /**
     * Reveal the n length number behind the underscores in n steps.
     *
     * @param n
     * @return
     */
    public String captureCodeFragment03(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i < j) {
                    sb.append('_');
                } else {
                    sb.append(j);
                }
            }
            sb.append(' ');
        }
        return sb.toString();
    }

    /**
     * Makes n length words by n times. The hyphen character is stepping through. Starting form the
     * left side of the leftmost word to right side of rightmost word. Every word consist of a hyphen
     * character and the given input string.
     *
     * @param n
     * @param b
     * @return
     */
    public String captureCodeFragment04(int n, String b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sb.append('-');
                } else {
                    sb.append(b);
                }
            }
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /**
     * Concatenates input string length words by input string length times. The underline character is
     * stepping through. Starting form the left side of the leftmost word to right side of rightmost
     * word. Every word consist of a underline character and the remaining content of the input
     * string.
     *
     * @param a
     * @return
     */
    public String captureCodeFragment05(String a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (j == i) {
                    sb.append('_');
                } else {
                    sb.append(a.charAt(j));
                }
            }
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /**
     * Concatenates size length words by size times. The underline character fill the inner spaces of
     * inner words.
     *
     * @param size
     * @return
     */
    public String captureCodeFragment06(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    sb.append('$');
                } else {
                    sb.append('_');
                }
            }
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /**
     * Concatenate <b>width</b> size words by <b>height </b> times. A word contains 'x' and 'o'
     * characters in distinctive order. Every 'x' followed or precede an 'o' character and back and
     * forth in case of 'o'. The sum of the actual index of height and width will be determine the
     * actual character on the actual position. In case of the sum is even then it will be 'x'. On the
     * other cases that will be 'o'.
     *
     * @param height
     * @param width
     * @return
     */
    public String captureCodeFragment07(int height, int width) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    sb.append('x');
                } else {
                    sb.append('o');
                }
            }
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /**
     * Concatenate 2 times input number minus 1 words. It show like a big palindromic number. So it
     * can be read from the left to the right and from the right to the left. The meaning and the
     * value will be the same. Every words containing digit determines the length of word. If the
     * actual number is not symmetrical then the algorithm will jump through this number.
     *
     * @param number
     * @return
     */
    public String captureCodeFragment08(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < number; i++) {
            addNumber(sb, i);
        }
        for (int i = number; i >= 1; i--) {
            addNumber(sb, i);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /**
     * Helper function to create a i length number what contains the same i digit.
     *
     * @param sb
     * @param i
     */
    public void addNumber(StringBuilder sb, int i) {
        StringBuilder helper = new StringBuilder();
        for (int j = 1; j <= i; j++) {
            helper.append(i);
        }
        if (isPalindrome(helper)) {
            sb.append(helper);
            sb.append(' ');
        }
    }

    /**
     * Check that is the same value in case of read from left to right or right to left.
     *
     * @param number
     * @return
     */
    public boolean isPalindrome(StringBuilder number) {
        String orig = number.toString();
        String rev = number.reverse().toString();
        return orig.equals(rev);
    }

}
