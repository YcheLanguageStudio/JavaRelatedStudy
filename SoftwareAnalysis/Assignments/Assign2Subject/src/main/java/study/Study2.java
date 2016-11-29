package study;

import java.util.Arrays;

/**
 * Created by cheyulin on 11/29/16.
 */
public class Study2 {
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
        int[] arr = {11, -2, -33, 4, -5};

        System.out.println("jarUtil:" + jarUtil.findMinViaIteration(arr));
        System.out.println("srcUtil" + srcUtil.findMinViaIteration(arr));
        Arrays.sort(arr);
        System.out.println("correct:" + arr[0]);
    }

    private static void studyFindMinViaRecursion() {
        System.out.println("\nstudyFindMinViaRecursion");
        int[] arr = {11, -2, -33, 4, -5};

        System.out.println("jarUtil:" + jarUtil.findMinViaRecursion(arr));
        System.out.println("srcUtil" + srcUtil.findMinViaRecursion(arr));
        Arrays.sort(arr);
        System.out.println("correct:" + arr[0]);
    }

    public static void main(String[] args) {
        studyFindMInViaIteration();
        studyFindMinViaRecursion();
    }
}
