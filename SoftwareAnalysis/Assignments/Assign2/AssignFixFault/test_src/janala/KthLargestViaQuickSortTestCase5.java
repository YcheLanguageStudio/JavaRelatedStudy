package janala;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cheyulin on 11/29/16.
 */

public class KthLargestViaQuickSortTestCase5 {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    @Test
    public void testKthLargestViaQuickSort() throws Exception {
        int[] arr0 = {1, 1, 1, 1, 1, 1, 1};
        int[] arr1 = {1, 1, 1, 1, 1, 1, 1};

        for (int i = 1; i < arr0.length + 1; i++)
            assertEquals(jarUtil.findKthLargestViaQuickSort(arr0, i), srcUtil.findKthLargestViaQuickSort(arr1, i));
    }
}
