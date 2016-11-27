package tests.subject_program.error;

import catg.CATG;

import java.util.Arrays;

/**
 * Created by cheyulin on 11/27/16.
 */
public class TestIntArray {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.subject_program.error.IntArrayUtil srcUtil = new tests.subject_program.error.IntArrayUtil();

    private static boolean ArrayCompare(int[] left, int[] right) {
        if (left.length != right.length)
            return false;
        for (int i = 0; i < left.length; i++) {
            if (left[i] != right[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = CATG.readInt(1);
        arr[1] = CATG.readInt(2);
        arr[2] = CATG.readInt(3);
        arr[3] = CATG.readInt(4);
        arr[4] = CATG.readInt(5);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        srcUtil.getNextPermutationNumber(arr);
        jarUtil.getNextPermutationNumber(arr2);
        if (ArrayCompare(arr, arr2)) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }
}
