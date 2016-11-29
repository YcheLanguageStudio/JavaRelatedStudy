package tests.homework.driver;

import janala.Main;

import java.util.Arrays;

/**
 * Created by cheyulin on 11/28/16.
 */

public class FindMinViaIterTestDriver {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    public static void main(String[] args) {
        for (int arrLen = 1; arrLen < 10; arrLen++) {
            int[] arr0 = Utility.generateArray(arrLen);
            int[] arr1 = Arrays.copyOf(arr0, arr0.length);
            int[] input = Arrays.copyOf(arr0, arr0.length);

            int srcVal = srcUtil.findMinViaIteration(arr0);
            int jarVal = jarUtil.findMinViaIteration(arr1);

            Utility.printInput(input);
            Utility.compareAndPrintResult(srcVal, jarVal);
        }
    }
}
