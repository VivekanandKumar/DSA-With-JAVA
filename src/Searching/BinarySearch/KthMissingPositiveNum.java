package Searching.BinarySearch;
//https://leetcode.com/problems/kth-missing-positive-number/

import java.util.ArrayList;
import java.util.List;

public class KthMissingPositiveNum {
    static int find(int[] arr, int k) {
        int start = 0;
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= arr[arr.length - 1] + k; i++) {
            if (search(arr, start, i) == -1) {
                l.add(i);
            }
        }
        System.out.println(l);
        return l.get(k - 1);
    }

    static int search(int[] arr, int start, int target) {
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        System.out.println(find(arr, k));
    }
}
