package tests.homework.yche;

/**
 * Created by cheyulin on 11/28/16.
 */
public class KthLargestViaQuickSort {
    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    public static void main(String[] args) {
        System.out.println(jarUtil.findKthLargestViaQuickSort(null, 1));
        System.out.println(srcUtil.findKthLargestViaQuickSort(null, 1));
        System.out.println(jarUtil.findKthLargestViaQuickSort(null, -1));
        System.out.println(srcUtil.findKthLargestViaQuickSort(null, -1));
    }
}
