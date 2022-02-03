package Searching.BinarySearch;

import java.util.Arrays;

//  https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum {
    static int[] searchNums(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] + arr[end] == target)
                return new int[]{start, end};
            else if (arr[start] + arr[end] > target)
                end--;
            else
                start++;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 9, 56, 90};
        int target = 8;
        System.out.println(Arrays.toString(searchNums(arr, target)));
    }

}
