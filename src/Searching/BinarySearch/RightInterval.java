package Searching.BinarySearch;

import java.util.Arrays;
import java.util.HashMap;

public class RightInterval {

    // O(n^2) solution
    static int[] rightInterval(int[][] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MAX_VALUE;
            int index = -1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][0] >= arr[i][1]) {
                    if (max > arr[j][0]) {
                        max = arr[j][0];
                        index = j;
                    }
                }
            }
            ans[i] = index;
        }
        return ans;
    }

    //   nlog(n) solution
    static int[] binaryRightInterval(int[][] arr) {
        int[] ans = new int[arr.length];
        int[] temp = new int[arr.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i][0], i);
            temp[i] = arr[i][0];
        }
        Arrays.sort(temp);

        for (int i = 0; i < arr.length; i++) {
            int index = ceiling(temp, arr[i][1]);
            if (index != -1) {
                ans[i] = map.get(temp[index]);
            } else
                ans[i] = index;
        }
        return ans;
    }

    //    return the index of ceiling number;
    static int ceiling(int[] arr, int target) {
        // No ceiling found;
        if (target > arr[arr.length - 1])
            return -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {4, 5},
                {2, 3},
                {1, 2}
        };
        System.out.println(Arrays.toString(binaryRightInterval(arr)));
    }
}
