package tests.homework.driver;

import catg.CATG;

/**
 * Created by cheyulin on 11/28/16.
 */

public class Utility {
    static void printInput(int[] inputArr, int targetVal) {
        String stringBuilder = "Input Array:" + serializeArray(inputArr) + ";Input Value:" + targetVal;
        System.out.println(stringBuilder);
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
        if (compareArray(left, right)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    static void compareAndPrintResult(int[] left, int leftLen, int[] right, int rightLen) {
        if (leftLen == rightLen) {
            for (int i = 0; i < leftLen; i++) {
                if (left[i] != right[i]) {
                    System.out.println("Fail");
                    return;
                }
            }
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    static int[] generateArray(int arrLen) {
        if (arrLen > 0) {
            int[] arr0 = CATG.readIntArray(arrLen, 1);
            return arr0;
        } else {
            return null;
        }
    }

    private static String serializeArray(int[] arr) {
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

    private static boolean compareArray(int[] left, int[] right) {
        if (left.length != right.length)
            return false;
        for (int i = 0; i < left.length; i++) {
            if (left[i] != right[i])
                return false;
        }
        return true;
    }
}
