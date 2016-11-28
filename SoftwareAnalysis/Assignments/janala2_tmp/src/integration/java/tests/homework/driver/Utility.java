package tests.homework.driver;

import catg.CATG;

/**
 * Created by cheyulin on 11/28/16.
 */

public class Utility {
    static void printInput(int[] inputArr, int targetVal) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Input Array:");
        stringBuilder.append(serializeArray(inputArr));
        stringBuilder.append(";Input Value:");
        stringBuilder.append(targetVal);
        System.out.println(stringBuilder.toString());
    }

    static void printInput(int[] inputArr) {
        System.out.println("Input Array:" + serializeArray(inputArr));
    }

    static void compareAndPrintResult(int left, int right) {
        if (left == right) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    static void compareAndPrintResult(int[] left, int[] right) {
        if (CompareArray(left, right)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    static String serializeArray(int[] arr) {
        if (arr == null || arr.length == 0)
            return "[]";
        else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('[');
            for (int i = 0; i < arr.length; i++) {
                stringBuilder.append(arr[i]);
                if (i != arr.length - 1) {
                    stringBuilder.append(',');
                }
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    static int[] generateArray(int arrLen) {
        if (arrLen > 0) {
            int[] arr0 = new int[arrLen];
            for (int i = 0; i < arrLen; i++) {
                arr0[i] = CATG.readInt(i);
            }
            return arr0;
        } else {
            return null;
        }
    }

    private static boolean CompareArray(int[] left, int[] right) {
        if (left.length != right.length)
            return false;
        for (int i = 0; i < left.length; i++) {
            if (left[i] != right[i])
                return false;
        }
        return true;
    }
}
