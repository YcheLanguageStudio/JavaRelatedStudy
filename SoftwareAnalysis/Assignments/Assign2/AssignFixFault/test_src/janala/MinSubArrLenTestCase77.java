package janala;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cheyulin on 11/29/16.
 */

public class MinSubArrLenTestCase77 {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    @Test
    public void testMinSubArr() throws Exception {
        int[] arr0 = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] arr1 = {1, 1, 1, 1, 1, 1, 1, 1};
        int targetVal  = 2;

        assertEquals(jarUtil.findMinSubArrayLen(targetVal, arr0), srcUtil.findMinSubArrayLen(targetVal, arr1));
    }
}