package Searching.BinarySearch;

//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPos {
    static int search(int[] arr, int target) {
        int start = 0;
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
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8, 10};
        int target = 4;
        System.out.println(search(arr, target));
    }
}
