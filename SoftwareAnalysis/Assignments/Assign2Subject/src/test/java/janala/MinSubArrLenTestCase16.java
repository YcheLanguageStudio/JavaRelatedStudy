package janala;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cheyulin on 11/29/16.
 */

public class MinSubArrLenTestCase16 {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    @Test
    public void testMinSubArr() throws Exception {
        int[] arr0 = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0};
        int targetVal  = 9;

        assertEquals(jarUtil.findMinSubArrayLen(targetVal, arr0), srcUtil.findMinSubArrayLen(targetVal, arr1));
    }
}