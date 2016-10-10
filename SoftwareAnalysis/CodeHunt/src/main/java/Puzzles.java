/**
 * Created by cheyulin on 9/5/16.
 */

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;

public class Puzzles {
    /**
     * Sum the values from 0 to input value. In case of positive the input value is inclusive. In case
     * of negative the input value is exclusive.
     *
     * @param x
     * @return
     */
    public int captureCodeFragment01(int x) {
        x = x >= 0 ? x : -x - 1;
        return x * (x + 1) / 2;
    }

    /**
     * @param x
     * @return
     */
    public int captureCodeFragment02(int x) {
        return x * (x * x + 1) / 2;
    }

    public static Boolean Puzzle3(int x, int f) {
        if (f == 1 || x % f != 0)
            return false;
        for (int i = 2; i <= Math.sqrt(f); i++) {
            if (f % i == 0) return false;
        }
        return true;
    }


    public static String Puzzle4(String s) {
        char[] ch = new char[(s.length() + 1) / 2];
        for (int i = 0; i < ch.length - 1; i++) {
            ch[i] = (char) ((((int) s.charAt(i * 2) - 'a') + ((int) s.charAt(i * 2 + 1) - 'a')) / 2 + 'a');
        }
        if (s.length() % 2 == 0) {
            ch[ch.length - 1]
                    = (char) ((((int) s.charAt(s.length() - 2) - 'a') + ((int) s.charAt(s.length() - 1) - 'a')) / 2 + 'a');
        } else {
            ch[ch.length - 1] = s.charAt(s.length() - 1);
        }
        return new String(ch);
    }

    public static int Puzzle5(int[] list) {
        Arrays.sort(list);
        int x = list[0];
        int diffcount = 1;
        for (int i = 1; i < list.length; i++) {
            if (x != list[i]) {
                x = list[i];
                diffcount++;
            }
        }
        return diffcount;
    }

    public static int[] Puzzle6(int[] list) {
        int[] temp = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }

        Arrays.sort(temp);
        int x = temp[0];
        int diffcount = 1;
        for (int i = 1; i < temp.length; i++) {
            if (x != temp[i]) {
                x = temp[i];
                diffcount++;
            }
        }

        //将不同的元素按list中出现的先后顺序输出
        int[] result = new int[diffcount];
        x = list[0];
        result[0] = list[0];
        diffcount = 1;
        for (int i = 1; i < list.length; i++) {
            Boolean bTrue = false;
            for (int j = 0; j < diffcount; j++) {
                if (result[j] == list[i]) {
                    bTrue = true;
                    break;
                }
            }
            if (!bTrue) {
                result[diffcount++] = list[i];
            }
        }

        return result;
    }

    public static Boolean Puzzle7(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static Boolean Puzzle8(String a, String b) {
        char[] cha = a.toCharArray();
        char[] chb = b.toCharArray();
        Arrays.sort(cha);
        Arrays.sort(chb);
        return new String(cha) == new String(chb) ? true : false;
    }

    public static String Puzzle9(int slope1, int yintercept1, int slope2, int yintercept2) {
        //slope：斜率
        //intercept：截距
        if (slope1 == slope2 && yintercept1 == yintercept2) {
            return "same line";
        }

        if (slope1 == slope2) {
            return "parallel lines";
        }

        double x = (yintercept2 - yintercept1) * 1.0 / (slope1 - slope2);
        double y = 1.0 * slope1 * x + yintercept1;
//        return String.format("({0}m{1})", x, y);
        String result="("+x+", "+y+")";
        return result.trim();
    }

}
