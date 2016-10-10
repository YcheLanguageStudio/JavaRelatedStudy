package util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cheyulin on 10/10/16.
 */
public class IntArrayUtilTest {

    IntArrayUtil util = new IntArrayUtil();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findKthLargestViaQuickSort() throws Exception {
        int[] num = {2, 3, 4, -2, -3, 0, 1, 5, 6, 7, 5};
        assertEquals(-2, util.findKthLargestViaQuickSort(num, 10));
    }

    @Test
    public void findMinViaRecursion() throws Exception {
        int[] num = {-1, 2, 3, -5, 10};
        assertEquals(-5, util.findMinViaRecursion(num));
    }

    @Test
    public void findMinViaIteration() throws Exception {
        int[] num = {-1, 2, 3, -5, 10};
        assertEquals(-5, util.findMinViaRecursion(num));
    }

    @Test
    public void removeDuplicateElements() throws Exception {
        int[] num = {-1, 2, -1, 3, 2, 0, 0};
        int[] expedted = {-1, 2, 3, 0};
        util.removeDuplicateElements(num);
        assertArrayEquals(expedted, num);
    }

    @Test
    public void findMinSubArrayLen() throws Exception {
        int[] num = {1,2,-3,-2,0};
        assertEquals(2,util.findMinSubArrayLen(-4,num));
        assertEquals(1,util.findMinSubArrayLen(-2,num));
    }

    @Test
    public void getNextPermutationNumber() throws Exception {

    }

    @Test
    public void threeSumClosest() throws Exception {

    }

}