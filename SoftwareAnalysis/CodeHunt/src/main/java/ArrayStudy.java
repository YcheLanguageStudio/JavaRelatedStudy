/**
 * Created by cheyulin on 9/5/16.
 */

public class ArrayStudy {
    /**
     * What is on the input index of the input array?
     *
     * @param list
     * @param i
     * @return
     */
    public int captureCodeFragment01(int[] list, int i) {
        return list[i];
    }

    /**
     * Concatenate the first and last element of the array.
     *
     * @param list
     * @return
     */
    public String captureCodeFragment02(String[] list) {
        return list[0] + list[list.length - 1];
    }

    /**
     * Is the input array contains the input number.
     *
     * @param list
     * @param i
     * @return
     */
    public Boolean captureCodeFragment03(int[] list, int i) {
        for (int j : list) {
            if (j == i) {
                return true;
            }
        }
        return false;
        // return Arrays.asList(list).contains(i);
    }

    /**
     * Fill an array with the input value. The length of array is 10.
     *
     * @param x
     * @return
     */
    public int[] captureCodeFragment04(int x) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = x;
        }
        return a;
    }

    /**
     * Fill an array with values range of from 0 to input value. The length of array is input value.
     *
     * @param n
     * @return
     */
    public int[] captureCodeFragment05(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        return a;
    }

    /**
     * Fill an array with true values. The length of array is 10.
     *
     * @return
     */
    public Boolean[] captureCodeFragment06() {
        return new Boolean[]{true, true, true, true, true, true, true, true, true, true};
    }

    /**
     * Create a string array from the input string. Every element from the array is represented with
     * one subsequent element from string.
     *
     * @param s
     * @return
     */
    public String[] captureCodeFragment07(String s) {
        String[] a = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i) + "";
        }
        return a;
    }

    /**
     * Create an input number + 1 size array then fill it with descending numbers starting from input
     * value to zero value.
     *
     * @param i
     * @return
     */
    public int[] captureCodeFragment08(int i) {
        int[] a = new int[i + 1];
        for (int j = 0; j <= i; j++) {
            a[j] = i - j;
        }
        return a;
    }

    /**
     * Invert the values of the array.
     *
     * @param numbers
     * @return
     */
    public int[] captureCodeFragment09(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = -numbers[i];
        }
        return numbers;
    }

    /**
     * Reverse the content of the input array.
     *
     * @param numbers
     * @return
     */
    public int[] captureCodeFragment10(int[] numbers) {
        int l = numbers.length;
        for (int i = 0; i < l / 2; i++) {
            int t = numbers[i];
            numbers[i] = numbers[l - i - 1];
            numbers[l - i - 1] = t;
        }
        return numbers;
    }

    /**
     * Reverse the content of the input string.
     *
     * @param s
     * @return
     */
    public String captureCodeFragment11(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    /*
     * char[] c = new char[s.length()]; for(int i = 0; i < s.length(); i++){ c[i] =
     * s.charAt(s.length() - 1 - i); } return new String(c);
     */
    }

    /**
     * Shift left the elements of the input array by input amount of steps.
     *
     * @param numbers
     * @param amount
     * @return
     */
    public int[] captureCodeFragment12(int[] numbers, int amount) {
        int[] output = new int[numbers.length];
        int li = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            int ni = amount + i > li ? amount + i - numbers.length : amount + i;
            while (ni > li) {
                ni -= numbers.length;
            }
            output[ni] = numbers[i];
        }
        return output;
    }

    /**
     * Swap two element of the array on the input positions.
     *
     * @param numbers
     * @param i
     * @param j
     * @return
     */
    public int[] captureCodeFragment13(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
        return numbers;
    }

    /**
     * Sum the two input array. The length of the sum array will be equal with the length of the
     * bigger input array.
     *
     * @param a
     * @param b
     * @return
     */
    public int[] captureCodeFragment14(int[] a, int[] b) {
        int len = a.length > b.length ? a.length : b.length;
        int[] output = new int[len];
        for (int i = 0; i < len; i++) {
            output[i] = i < a.length ? a[i] : 0;
            output[i] += i < b.length ? b[i] : 0;
        }
        return output;
    }
}
