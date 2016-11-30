package janala;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cheyulin on 11/29/16.
 */


public class FindMinViaIterTestCase {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    @Test
    public void testFindMinViaIteration() throws Exception {
        int[] arr0 = {11, -2, 3, 5, 10};
        int[] arr1 = {11, -2, 3, 5, 10};

        assertEquals(jarUtil.findMinViaIteration(arr0), srcUtil.findMinViaIteration(arr1));
    }
}
