package tests.homework.driver;

import catg.CATG;
import janala.Main;

import java.util.Arrays;

/**
 * Created by cheyulin on 11/27/16.
 */

public class GetNextPermNumTestDriver {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    public static void main(String[] args) {
        int[] arr0 = CATG.readIntArray(3, 1);
        int[] arr1 = Arrays.copyOf(arr0, arr0.length);
        int[] input = Arrays.copyOf(arr0, arr0.length);

        CATG.BeginScope();
        srcUtil.getNextPermutationNumber(arr0);
        CATG.EndScope();

        jarUtil.getNextPermutationNumber(arr1);

        Utility.printInput(input);
        Utility.compareAndPrintResult(arr0, arr1);
    }
}
