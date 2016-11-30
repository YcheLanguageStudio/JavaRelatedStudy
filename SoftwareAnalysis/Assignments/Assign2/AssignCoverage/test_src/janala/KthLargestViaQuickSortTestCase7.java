package janala;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cheyulin on 11/29/16.
 */

public class KthLargestViaQuickSortTestCase7 {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    @Test
    public void testKthLargestViaQuickSort() throws Exception {
        int[] arr0 = {0, 0, 0, 0, 0, 0, 0, 1, -2};
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 1, -2};

        for (int i = 1; i < arr0.length + 1; i++)
            assertEquals(jarUtil.findKthLargestViaQuickSort(arr0, i), srcUtil.findKthLargestViaQuickSort(arr1, i));
    }
}
