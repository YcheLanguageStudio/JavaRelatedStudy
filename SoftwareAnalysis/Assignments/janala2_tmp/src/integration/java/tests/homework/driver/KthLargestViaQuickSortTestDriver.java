package tests.homework.driver;

import janala.Main;

import java.util.Arrays;

/**
 * Created by cheyulin on 11/28/16.
 */

public class KthLargestViaQuickSortTestDriver {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    public static void main(String[] args) {
        for (int arrLen = 1; arrLen < 10; arrLen++) {
            int[] arr0 = Utility.generateArray(arrLen);
            int[] arr1 = Arrays.copyOf(arr0, arr0.length);
            int[] input = Arrays.copyOf(arr0, arr0.length);

            for (int k = 0; k < arrLen; k++) {
                Main.EndScope();
                int srcVal = srcUtil.findKthLargestViaQuickSort(arr0, k);
                Main.EndScope();

                int jarVal = jarUtil.findKthLargestViaQuickSort(arr1, k);

                Utility.printInput(input, k);
                Utility.compareAndPrintResult(srcVal, jarVal);
            }
        }
    }
}
