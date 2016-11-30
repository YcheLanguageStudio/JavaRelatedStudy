package janala;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cheyulin on 11/29/16.
 */
public class ThreeSumCloseTestCase6 {

    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    @Test
    public void testThreeSumClose() throws Exception {
        int[] arr0 = {-1, 0, 0, 0, 0};
        int[] arr1 = {-1, 0, 0, 0, 0};
        int targetVal  = -2147483647;

        assertEquals(jarUtil.threeSumClosest(arr0, targetVal), srcUtil.threeSumClosest(arr1, targetVal));
    }
}
