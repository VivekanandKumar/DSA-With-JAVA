package Searching.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

    static int[] search(int[][] arr, int target) {
        int[] ans = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {4, 5, 9},
                {10, 78, 2},
                {56, 90, 100}
        };
        int target = 100;
        System.out.println(Arrays.toString(search(arr, target)));
    }
}
