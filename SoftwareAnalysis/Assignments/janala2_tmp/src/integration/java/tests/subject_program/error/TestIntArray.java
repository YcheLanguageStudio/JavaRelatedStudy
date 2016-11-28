package tests.subject_program.error;

import catg.CATG;
import groovy.transform.ToString;
import janala.Main;

import java.util.Arrays;

/**
 * Created by cheyulin on 11/27/16.
 */
public class TestIntArray {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.subject_program.error.IntArrayUtil srcUtil = new tests.subject_program.error.IntArrayUtil();

    private static boolean ArrayCompare(int[] left, int[] right) {
        Main.BeginScope();
        if (left.length != right.length)
            return false;
        for (int i = 0; i < left.length; i++) {
            if (left[i] != right[i])
                return false;
        }
        Main.EndScope();
        return true;
    }

    private static void printArray(int[] arr) {
        Main.BeginScope();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
            if (i != arr.length - 1) {
                stringBuilder.append(',');
            }
        }
        stringBuilder.append(']');
        System.out.println(stringBuilder.toString());
        Main.EndScope();
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = CATG.readInt(1);
        arr[1] = CATG.readInt(2);
        arr[2] = CATG.readInt(3);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] tmp_arr = Arrays.copyOf(arr, arr.length);
        srcUtil.getNextPermutationNumber(arr);
        jarUtil.getNextPermutationNumber(arr2);
        if (ArrayCompare(arr, arr2)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.print("Test Input:");
            printArray(tmp_arr);
        }
    }
}
