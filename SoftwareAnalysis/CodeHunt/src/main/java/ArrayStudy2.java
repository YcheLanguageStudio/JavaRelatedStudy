/**
 * Created by cheyulin on 9/5/16.
 */
public class ArrayStudy2 {
    /**
     * What is the element on the i index of row and j index of column?
     *
     * @param list
     * @param i
     * @param j
     * @return
     */
    public int captureCodeFragment01(int[][] list, int i, int j) {
        return list[i][j];
    }

    /**
     * Create a 5 x 5 matrix.
     *
     * @return
     */
    public int[][] captureCodeFragment02() {
        return new int[5][5];
    }

    /**
     * Create a length x length matrix and fill with x input values.
     *
     * @param length
     * @param x
     * @return
     */
    public int[][] captureCodeFragment03(int length, int x) {
        int[][] a = new int[length][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[length];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = x;
            }
        }
        return a;
    }

    /**
     * Duplicate values of all elements of the matrix.
     *
     * @param input
     * @return
     */
    public int[][] captureCodeFragment04(int[][] input) {
        int[][] a = new int[input.length][];
        for (int i = 0; i < input.length; i++) {
            a[i] = new int[input[i].length];
            for (int j = 0; j < input.length; j++) {
                a[i][j] = 2 * input[i][j];
            }
        }
        return a;
    }

    /**
     * What is the number of occurrences of the input value in the given matrix?
     *
     * @param input
     * @param i
     * @return
     */
    public int captureCodeFragment05(int[][] input, int i) {
        int count = 0;
        for (int j = 0; j < input.length; j++) {
            for (int k = 0; k < input[j].length; k++) {
                count += input[j][k] == i ? 1 : 0;
            }
        }
        return count;
    }

    /**
     * What is the maximum value in the matrix?
     *
     * @param input
     * @return
     */
    public int captureCodeFragment06(int[][] input) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                max = max < input[i][j] ? input[i][j] : max;
            }
        }
        return max;
    }

    /**
     * Which array has the biggest sum in the matrix?
     *
     * @param input
     * @return
     */
    public int[] captureCodeFragment07(int[][] input) {
        int max = Integer.MIN_VALUE;
        int maxI = 0;
        for (int i = 0; i < input.length; i++) {
            int tempMax = 0;
            for (int j = 0; j < input[i].length; j++) {
                tempMax += input[i][j];
            }
            maxI = tempMax > max ? i : maxI;
            max = tempMax > max ? tempMax : max;
        }
        return input[maxI];
    }

    /**
     * What is the biggest column sum in the matrix?
     *
     * @param input
     * @return
     */
    public int captureCodeFragment08(int[][] input) {
        int[] sumJ = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                sumJ[j] += input[i][j];
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < sumJ.length; i++) {
            maxSum = sumJ[i] > maxSum ? sumJ[i] : maxSum;
        }
        return maxSum;
    }
}
