package Searching.BinarySearch;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class CountNegativeNumbers {
    //  bruteforce approach.     O(N^2)
    static int negativeNums(int[][] arr) {
        int count = 0;
        for (int[] row : arr) {
            for (int j = 0; j < row.length; j++) {
                if (row[j] < 0) {
                    count += row.length - j;
                    break;
                }
            }
        }
        return count;
    }

    // Solved using binary search.  O(logN)
    static int couuntNegativeNums(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            count += search(matrix[i], matrix[i].length - 1);
        }
        return count;
    }

    static int search(int[] arr, int end) {
        int count = 0;
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < 0) {
                count += (end - mid) + 1;
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
//        System.out.println(negativeNums(arr));
        System.out.println(couuntNegativeNums(arr));
    }
}