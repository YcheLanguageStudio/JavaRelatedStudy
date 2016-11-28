package tests.homework.driver;

import janala.Main;

/**
 * Created by cheyulin on 11/28/16.
 */

public class Utility {
    public static void compareAndPrint(int left, int right, int[] original, int targetVal) {
        if (left == right) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.print("Test Input:");
            System.out.print("Target Val:" + String.valueOf(targetVal));
            Utility.printArray(original);
        }
    }

    public static void compareAndPrint(int[] left, int[] right, int[] original) {
        if (arrayCompare(left, right)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.print("Test Input:");
            Utility.printArray(original);
        }
    }

    public static void compareAndPrint(int left, int right, int[] original) {
        if (left == right) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.print("Test Input:");
            Utility.printArray(original);
        }
    }

    private static boolean arrayCompare(int[] left, int[] right) {
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

    public static void printArray(int[] arr) {
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
}
