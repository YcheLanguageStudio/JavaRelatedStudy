import java.util.Arrays;

/**
 * Created by cheyulin on 9/5/16.
 */
public class SearchSort {
    /**
     * Count the occurrences of input integer value in the input integer array.
     *
     * @param numbers
     * @param x
     * @return
     */
    public int captureCodeFragment01(int[] numbers, int x) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count += numbers[i] == x ? 1 : 0;
        }
        return count;
    }

    /**
     * Count the occurrences of input string value in the input string array.
     *
     * @param words
     * @param s
     * @return
     */
    public int captureCodeFragment02(String[] words, String s) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            count += words[i].equals(s) ? 1 : 0;
        }
        return count;
    }

    /**
     * Give back the first index number of the input value inside the input array.
     *
     * @param numbers
     * @param x
     * @return
     */
    public int captureCodeFragment03(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Give back the last index number of the input value inside the input array.
     *
     * @param numbers
     * @param x
     * @return
     */
    public int captureCodeFragment04(int[] numbers, int x) {
        for (int i = numbers.length - 1; i > -1; i--) {
            if (numbers[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Give back the index numbers of the input value which inside the input array.
     *
     * @param numbers
     * @param x
     * @return
     */
    public int[] captureCodeFragment05(int[] numbers, int x) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                count++;
            }
        }
        int[] positions = new int[count];
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                positions[count++] = i;
            }
        }
        return positions;
    }

    /**
     * Replace every x input values to y input value in the input array.
     *
     * @param numbers
     * @param x
     * @param y
     * @return
     */
    public int[] captureCodeFragment06(int[] numbers, int x, int y) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] == x ? y : numbers[i];
        }
        return numbers;
    }

    /**
     * Looking for sum indexes of the input array for the input value.
     *
     * @param numbers
     * @param x
     * @return
     */
    public int[][] captureCodeFragment07(int[] numbers, int x) {
        int[][] result = new int[0][];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == x) {
                    result = copyOf(result, result.length + 1);
                    result[result.length - 1] = new int[]{i, j};
                }
            }
        }
        return result;
    }

    /**
     * Helper function for extend the array size.
     *
     * @param input
     * @param newLength
     * @return
     */
    public int[][] copyOf(int[][] input, int newLength) {
        int[][] result = new int[newLength][];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i];
        }
        return result;
    }

    /**
     * Try to determine is there any possible sum in front part of the array which is equal with the
     * back part of the array.
     *
     * @param numbers
     * @return index of the last element from the front part in case of match<br>
     * -1 in case of no match
     */
    public int captureCodeFragment08(int[] numbers) {
        int fullSum = 0;
        for (int number : numbers) {
            fullSum += number;
        }
        int partSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            partSum += numbers[i];
            if (partSum * 2 == fullSum) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Array has an ascending order?
     *
     * @param numbers
     * @return
     */
    public Boolean captureCodeFragment09(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * String array has an ascending order?
     *
     * @param words
     * @return
     */
    public Boolean captureCodeFragment10(String[] words) {
        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].compareTo(words[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Sort ascending order the input array.
     *
     * @param a
     * @return
     */
    public int[] captureCodeFragment11(int[] a) {
        Arrays.sort(a);
        return a;
    }

    /**
     * Sort ascending order the input String array.
     *
     * @param a
     * @return
     */
    public String[] captureCodeFragment12(String[] a) {
        Object[] o = a;
        Arrays.sort(o);
        return (String[]) o;
    }

//    public static String[] Puzzle(String[] a) {
//        quickSort(a, 0, a.length - 1);
//        return a;
//    }
//
//    public static void quickSort(String[] array, int start, int end) {
//        int i = start; // index of left-to-right scan
//        int k = end; // index of right-to-left scan
//
//        if (end - start >= 1) // check that there are at least two elements to sort
//        {
//            String pivot = array[start]; // set the pivot as the first element in the partition
//
//            while (k > i) // while the scan indices from left and right have not met,
//            {
//                while (array[i].compareTo(pivot) <= 0 && i <= end && k > i) {
//                    i++; // element greater than the pivot
//                }
//                while (array[k].compareTo(pivot) > 0 && k >= start && k >= i) {
//                    k--; // element not greater than the pivot
//                }
//                if (k > i) {
//                    swap(array, i, k); // the right index, swap the corresponding elements
//                }
//            }
//            swap(array, start, k); // after the indices have crossed, swap the last element in
//            // the left partition with the pivot
//            quickSort(array, start, k - 1); // quicksort the left partition
//            quickSort(array, k + 1, end); // quicksort the right partition
//        } else // if there is only one element in the partition, do not do any sorting
//        {
//            return; // the array is sorted, so exit
//        }
//    }
//
//    public static void swap(String[] array, int index1, int index2)
//    //pre: array is full and index1, index2 < array.length
//    //post: the values at indices 1 and 2 have been swapped
//    {
//        String temp = array[index1]; // store the first value in a temp
//        array[index1] = array[index2]; // copy the value of the second into the first
//        array[index2] = temp; // copy the value of the temp into the second
//    }
}
