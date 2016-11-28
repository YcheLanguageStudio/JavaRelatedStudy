package tests.homework.driver;

import janala.Main;

import java.util.Arrays;

/**
 * Created by cheyulin on 11/28/16.
 */
public class FindMinViaRecurTestDriver {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    public static void main(String[] args) {
        for (int arrLen = 1; arrLen < 10; arrLen++) {
            int[] arr0 = Utility.generateArray(arrLen);
            int[] arr1 = Arrays.copyOf(arr0, arr0.length);
            int[] input = Arrays.copyOf(arr0, arr0.length);

            Main.BeginScope();
            int srcVal = srcUtil.findMinViaRecursion(arr0);
            Main.EndScope();

            int jarVal = jarUtil.findMinViaRecursion(arr1);

            Utility.printInput(input);
            Utility.compareAndPrintResult(srcVal, jarVal);
        }
    }
}
