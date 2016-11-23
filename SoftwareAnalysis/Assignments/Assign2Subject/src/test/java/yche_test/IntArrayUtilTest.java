package yche_test;

import util.IntArrayUtil;

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
        int[] num = {11, -2, 3, 5, 10};
        assertEquals(-2, util.findMinViaRecursion(num));
    }

    @Test
    public void removeDuplicateElements() throws Exception {
        int[] num = {1, 2, 1, 3, 2, 0, 0};
        int[] expecdted = {1, 2, 3, 0};
        util.removeDuplicateElements(num);
        assertArrayEquals(expecdted, num);
    }

    @Test
    public void findMinSubArrayLen() throws Exception {
        int[] num = {1, 2, -3, -2, 0};
        assertEquals(1, util.findMinSubArrayLen(-3, num));
        assertEquals(2, util.findMinSubArrayLen(-4, num));
    }

    @Test
    public void getNextPermutationNumber() throws Exception {
        int[] num = {1, 2, 3, 4, 5};
        int[] res = {1, 2, 3, 5, 4};
        util.getNextPermutationNumber(num);

        int[] num1 = {1, -2, 3, 4, 5};
        int[] res1 = {1, 3, -2, 4, 5};
        assertArrayEquals(res1, num1);
    }

    @Test
    public void threeSumClosest() throws Exception {
        int num[] = {-1, 2, 0, 4};
        assertEquals(-5, util.threeSumClosest(num, -4));
        assertEquals(5, util.threeSumClosest(num, 4));
        assertEquals(-2, util.threeSumClosest(num, -1));
        assertEquals(1, util.threeSumClosest(num, 2));
    }
}