package janala;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cheyulin on 11/29/16.
 */

public class FindMinViaRecurTestCase6 {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    @Test
    public void testFindMinViaRecursion() throws Exception {
        int[] arr0 = {1, 1, 1};
        int[] arr1 = {1, 1, 1};

        assertEquals(jarUtil.findMinViaRecursion(arr0), srcUtil.findMinViaRecursion(arr1));
    }
}
