/**
 * Created by cheyulin on 9/5/16.
 */

public class Loops {
    public static int[] Puzzle0(int n) {
        int[] integers = new int[n];
        for (int index = 0; index < n; index++) {
            integers[index] = index;
        }
        return integers;
    }

    public static int[] Puzzle1(int n) {
        int[] integers = new int[n];
        for (int index = 0; index < n; index++) {
            integers[index] = n * index;
        }
        return integers;
    }


    public static int[] Puzzle2(int n) {
        int[] integers = new int[n];
        for (int index = 0; index < n; index++) {
            integers[index] = index * index;
        }
        return integers;
    }

    public static int Puzzle3(int[] v) {
        int sum = 0;
        for (int integer : v) {
            sum += integer;
        }
        return sum;
    }

    public static int Puzzle4(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index * index;
        }
        return sum;
    }

    public static int Puzzle5(String s) {
        int sum = 0;
        for (char character : s.toCharArray()) {
            if (character == 'a') {
                sum++;
            }
        }
        return sum;
    }

    public static int Puzzle6(String s, char x) {
        int sum = 0;
        for (char character : s.toCharArray()) {
            if (character == x) {
                sum++;
            }
        }
        return sum;
    }

}
