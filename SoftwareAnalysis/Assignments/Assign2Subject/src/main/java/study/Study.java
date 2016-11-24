package study;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by cheyulin on 11/23/16.
 */

public class Study {

    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static error.IntArrayUtil srcUtil = new error.IntArrayUtil();

    private static void printArray(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append('[');
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
            if (i != arr.length - 1) {
                stringBuilder.append(',');
            }
        }
        stringBuilder.append(']');
        System.out.println(stringBuilder.toString());

    }

    private static void studyFindMInViaIteration() {
        System.out.println("\nstudyFindMInViaIteration");
        int[] arr = {11, -2, 33, 4, -5};
        int[] arr2 = {11, -2, 3, 5, 10};
        System.out.println(jarUtil.findMinViaIteration(arr));
        System.out.println(jarUtil.findMinViaIteration(arr2));
        System.out.println(srcUtil.findMinViaIteration(arr));
        System.out.println(srcUtil.findMinViaIteration(arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println("correct:" + arr[0]);
        System.out.println("correct:" + arr2[0]);

    }

    private static void studyFindMinViaRecursion() {
        System.out.println("\nstudyFindMinViaRecursion");
        int[] arr = {11, -2, -33, 4, -5};
        int[] arr2 = {11, 3, 3, 5, -10};
        System.out.println(jarUtil.findMinViaRecursion(arr));
        System.out.println(jarUtil.findMinViaRecursion(arr2));
        System.out.println(srcUtil.findMinViaRecursion(arr));
        System.out.println(srcUtil.findMinViaRecursion(arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println("correct:" + arr[0]);
        System.out.println("correct:" + arr2[0]);

    }


    private static void studyRemoveDuplicateElements() {
        System.out.println("\nstudyRemoveDuplicateElements");
        int[] num = {1, 2, 1, 3, 2, 0, 0};
        int[] num2 = {1, 2, 1, 3, 2, 0, 0};
        int[] num_filter = {1, 2, 1, 3, 2, 0, 0};

        System.out.println("jar_util:" + jarUtil.removeDuplicateElements(num));
        printArray(num);

        System.out.println("src_util:" + srcUtil.removeDuplicateElements(num2));
        printArray(num2);

        Set<Integer> my_set = new HashSet<Integer>();
        for (int number : num_filter) {
            my_set.add(number);
        }
        int[] res = new int[my_set.size()];
        int index = 0;
        for (int ele : my_set) {
            res[index] = ele;
            index++;
        }
        System.out.print("correct:");
        printArray(res);
    }


    private static void studyKthLargestViaQuickSort() {
        System.out.println("\nstudyKthLargestViaQuickSort");
        int[] num = {2, 3, 4, 2, -3, 0, 1, 5, 6, 7, 5};
        int k = 9;
        System.out.println("jar_util:" + jarUtil.findKthLargestViaQuickSort(num, k));
        System.out.println("src_util:" + srcUtil.findKthLargestViaQuickSort(num, k));
        Arrays.sort(num);
        System.out.println("quick_sort:" + num[num.length - k]);
    }

    private static void studyFindMinSubArrayLen() {
        System.out.println("\nstudyFindMinSubArrayLen");
        int[] num = {1, 2, -3, -2, 0};
        System.out.println(jarUtil.findMinSubArrayLen(-2, num));
        System.out.println(jarUtil.findMinSubArrayLen(-4, num));
        System.out.println(srcUtil.findMinSubArrayLen(-2, num));
        System.out.println(srcUtil.findMinSubArrayLen(-4, num));
    }

    private static void studyGetNextPermutationNumber() {
        System.out.println("\nstudyGetNextPermutationNumber");
        int[] num = {1, 2, 3, 4, 5};
        jarUtil.getNextPermutationNumber(num);
        printArray(num);

        int[] another_num = {1, -2, 3, 4, 5};
        jarUtil.getNextPermutationNumber(another_num);
        printArray(another_num);

        int[] num2 = {1, 2, 3, 4, 5};
        srcUtil.getNextPermutationNumber(num2);
        printArray(num2);

        int[] another_num2 = {1, -2, 3, 4, 5};
        srcUtil.getNextPermutationNumber(another_num2);
        printArray(another_num2);

    }

    private static void studyThreeSumClosest() {
        System.out.println("\nstudyThreeSumClosest");
        int num[] = {-1, 2, 0, 5};
        System.out.println(jarUtil.threeSumClosest(num, -4));
        System.out.println(jarUtil.threeSumClosest(num, 4));
        System.out.println(srcUtil.threeSumClosest(num, -4));
        System.out.println(srcUtil.threeSumClosest(num, 4));
    }

    public static void main(String[] args) {
        studyFindMInViaIteration();
        studyFindMinViaRecursion();
        studyRemoveDuplicateElements();
        studyKthLargestViaQuickSort();
        studyFindMinSubArrayLen();
        studyGetNextPermutationNumber();
        studyThreeSumClosest();
    }
}
