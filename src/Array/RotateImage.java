package Array;

import java.util.Arrays;

public class RotateImage {
    static void rotate(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                temp[i][j] = matrix[i][j];
            }
        }
        for (int i = 0, n = temp.length - 1; i < temp.length; i++, n--) {
            int[] row = temp[i];
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][n] = row[j];
            }
        }
        for (int[] item : matrix) {
            System.out.println(Arrays.toString(item));
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 4, 2},
                {4, 5, 3}
        };
        rotate(arr);
    }
}
