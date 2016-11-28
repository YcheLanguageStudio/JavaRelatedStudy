package tests.homework.driver;

import catg.CATG;

import java.util.Arrays;

/**
 * Created by cheyulin on 11/27/16.
 */

public class GetNextPermNumTestDriver {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    public static void main(String[] args) {
        for (int arrLen = 1; arrLen < 10; arrLen++) {
            int[] arr0 = new int[arrLen];
            for (int i = 0; i < arrLen; i++) {
                arr0[i] = CATG.readInt(i);
            }
            int[] arr1 = Arrays.copyOf(arr0, arr0.length);
            int[] input = Arrays.copyOf(arr0, arr0.length);
            srcUtil.getNextPermutationNumber(arr0);
            jarUtil.getNextPermutationNumber(arr1);
            System.out.println("ArrLen:" + String.valueOf(arrLen));
            Utility.printArray(input);
            Utility.compareAndPrint(arr0, arr1, input);
        }
    }
}
