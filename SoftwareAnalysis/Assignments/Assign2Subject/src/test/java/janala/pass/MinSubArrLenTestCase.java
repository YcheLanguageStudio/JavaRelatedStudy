package janala.pass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cheyulin on 11/29/16.
 */

public class MinSubArrLenTestCase {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    @Test
    public void testMinSubArr() throws Exception {
        int[] arr0 = {11, -2, 3, 5, 10};
        int[] arr1 = {11, -2, 3, 5, 10};
        int targetVal = 1;

        assertEquals(jarUtil.findMinSubArrayLen(targetVal, arr0), srcUtil.findMinSubArrayLen(targetVal, arr1));
    }
}