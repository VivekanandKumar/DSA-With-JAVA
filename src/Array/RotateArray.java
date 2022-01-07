package Array;

import java.util.Arrays;

public class RotateArray {

    static int[][] rotate(int[][] arr) {
        int[][] answer = new int[arr[0].length][arr.length];
        for (int i = 0, n = arr.length - 1; i < arr.length; i++, n--) {
            int[] row = arr[i];
            for (int j = 0; j < arr.length; j++) {
                answer[j][n] = row[j];
            }
        }
        return answer;
    }

    static boolean isRotatable(int[][] arr, int[][] target) {
        boolean flag = false;
        int[][] temp = rotate(arr);
        for (int i = 0; i < 3; i++) {
            if (Arrays.deepEquals(target, arr) || Arrays.deepEquals(target, temp)) {
                flag = true;
                break;
            } else {
                temp = rotate(temp);
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] target = {
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 0}
        };
        System.out.println(isRotatable(arr, target));
    }
}
