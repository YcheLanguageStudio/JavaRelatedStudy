package study;


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
        int[] arr = {11, 2, -3, 4, 5};
        System.out.println(jarUtil.findMinViaIteration(arr));
        System.out.println(srcUtil.findMinViaIteration(arr));
    }

    private static void studyRemoveDuplicateElements() {
        System.out.println("\nstudyRemoveDuplicateElements");
        int[] num = {1, 2, 1, 3, 2, 0, 0};
        int[] num2 = new int[num.length];
        System.arraycopy(num, 0, num2, 0, num2.length);

        System.out.println("jar util after removing:" + jarUtil.removeDuplicateElements(num));
        printArray(num);

        System.out.println("jar util after removing:" + srcUtil.removeDuplicateElements(num2));
        printArray(num2);
    }

    
    public static void main(String[] args) {
        studyFindMInViaIteration();
        studyRemoveDuplicateElements();
    }

}
