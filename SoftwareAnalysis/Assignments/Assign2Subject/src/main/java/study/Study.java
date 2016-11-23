package study;

import util.IntArrayUtil;

/**
 * Created by cheyulin on 11/23/16.
 */

public class Study {
    public static void main(String[] args) {
        IntArrayUtil arrayUtil = new IntArrayUtil();
        error.IntArrayUtil arrayUtilError = new error.IntArrayUtil();
        int[] arr = {11, 2, -3, 4, 5};
        System.out.println(arrayUtil.findMinViaIteration(arr));
        System.out.println(arrayUtilError.findMinViaIteration(arr));
    }

}
