package Array;

import java.util.Arrays;

public class TransposeMatrix {

    static int[][] transpose(int[][] arr) {
        int[][] answer = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[j][i] = arr[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 4},
                {3, 5, 4},
                {9, 4, 1}
        };
        for (int[] item : transpose(arr)) {
            System.out.println(Arrays.toString(item));
        }
    }
}
