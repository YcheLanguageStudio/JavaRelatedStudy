
/**
 * Created by cheyulin on 9/5/16.
 */

public class Loops2 {
    public static int Puzzle0(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }

    public static int Puzzle1(int i) {
        if (i == 1)
            return 1;
        else
            return Puzzle1(i - 1) * i;
    }

    public static int Puzzle2(int lowerBound, int upperBound) {
        int result = lowerBound;
        for (int intermediate = lowerBound + 1; intermediate < upperBound + 1; intermediate++) {
            result *= intermediate;
        }
        return result;
    }

    public static int Puzzle3(int n) {
        int sum = 0;
        for (int i = 2; i < n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static int Puzzle4(int upperBound) {
        int sum = 0;
        for (; upperBound > 0; upperBound -= 2) {
            sum += upperBound * upperBound;
        }
        return sum;
    }

    public static String Puzzle5(String word) {
        return word.replaceAll(".", "_ ").trim();
    }

    // 'a' 97  'z' 122
    public static String Puzzle6(String s) {
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[i] = (char) (s.charAt(i) + 5);
            if (c[i] > 122) {
                c[i] = (char) (c[i] + 96 - 122);
            }
        }
        return new String(c);
    }

    public static int Puzzle(int x) {
        int num = 0;
        for (; x != 0; x /= 10)
            num++;
        return num;
    }

}
