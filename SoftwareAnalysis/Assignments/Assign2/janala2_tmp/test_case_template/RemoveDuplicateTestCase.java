package janala;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by cheyulin on 11/29/16.
 */
 
public class RemoveDuplicateTestCase {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    static boolean compareArr(int[] left, int leftLen, int[] right, int rightLen) {
        if (leftLen == rightLen) {
            for (int i = 0; i < leftLen; i++) {
                if (left[i] != right[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void testRemoveDuplicate() throws Exception {
        int[] arr0 = {11, -2, 3, 5, 10};
        int[] arr1 = {11, -2, 3, 5, 10};

        int arr0Len = jarUtil.removeDuplicateElements(arr0);
        int arr1Len = srcUtil.removeDuplicateElements(arr1);

        assertTrue(compareArr(arr0, arr0Len, arr1, arr1Len));

    }
}
