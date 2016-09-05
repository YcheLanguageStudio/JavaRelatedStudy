/**
 * Created by cheyulin on 9/5/16.
 */
public class ArrayStudy3 {
    /**
     * Calculate the difference of all appropriate element of the two input arrays. So take the
     * difference of two elements on the same index position. If there is no other element so one of
     * the two array is bigger than copy the value of the input array.
     *
     * @param a
     * @param b
     * @return
     */
    public int[] captureCodeFragment01(int[] a, int[] b) {
        int[] output = a.length > b.length ? a : b;
        for (int i = 0; i < output.length; i++) {
            if (i < a.length && i < b.length) {
                output[i] = Math.abs(a[i] - b[i]);
            }
        }
        return output;
    }

    /**
     * Multiply the size of input array by the input number. First multiply the first element of the
     * array by amount times then do the same with all the elements consequently.
     *
     * @param a
     * @param amount
     * @return
     */
    public String[] captureCodeFragment02(String[] a, int amount) {
        String[] output = new String[a.length * amount];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < amount; j++) {
                output[index++] = a[i];
            }
        }
        return output;
    }

    /**
     * Are the diagonals of the matrix equals?
     *
     * @param input
     * @return
     */
    public Boolean captureCodeFragment03(int[][] input) {
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < input.length; i++) {
            sumA += input[i][i];
            sumB += input[i][input.length - 1 - i];
        }
        return sumA == sumB;
    }

    /**
     * Return a list with data. Every element indicate the remainder if the appropriate input list
     * element divided by input value.
     *
     * @param list
     * @param modBy
     * @return
     */
    public int[] captureCodeFragment04(int[] list, int modBy) {
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] % modBy;
        }
        return list;
    }

    /**
     * Create a String array and fill it with the concatenated values of the input array. In case of
     * even length of the input array the length of output array will be even. Otherwise it will be
     * odd.
     *
     * @param list
     * @return
     */
    public String[] captureCodeFragment05(String[] list) {
        String[] output = new String[(int) Math.ceil(list.length / 2.0)];
        for (int i = 0; i < list.length; i += 2) {
            output[i / 2] = list[i];
            if (i < list.length - 1) {
                output[i / 2] += list[i + 1];
            }
        }
        return output;
    }

    /**
     * Create an array which is contains the grades for values of the input array. According to the
     * input grades values.
     *
     * @param grades
     * @param A
     * @param B
     * @param C
     * @param D
     * @return
     */
    public String[] captureCodeFragment06(int[] grades, int A, int B, int C, int D) {
        String[] result = new String[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= A) {
                result[i] = "A";
            } else if (grades[i] >= B) {
                result[i] = "B";
            } else if (grades[i] >= C) {
                result[i] = "C";
            } else if (grades[i] >= D) {
                result[i] = "D";
            } else {
                result[i] = "E";
            }
        }
        return result;
    }

    /**
     * Swap the elements of the input matrix along the top left to bottom right diagonal.
     */
    public String[][] captureCodeFragment07(String[][] input) {
    /*
     * //rotate two dimensional matrix String[][] result = new
     * String[input.length][input[0].length]; for(int i = 0; i < input.length; i++){ for(int j = 0;
     * j < input[i].length; j++){ //+90 degree [input.length - 1 - i][j] = input[i][j] //-90 degree
     * result[input.length - 1 - j][i] = new String(input[i][j]); } } return result; //return input;
     */
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input[i].length; j++) {
                String tmp = input[i][j];
                input[i][j] = input[j][i];
                input[j][i] = tmp;
            }
        }
        return input;
    }
}
