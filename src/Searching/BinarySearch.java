package Searching;

public class BinarySearch {

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end])
            return -1;
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
        int[] arr = {4, 7, 9, 19, 33, 46, 78, 100};
        int target = 100;
        System.out.println(search(arr, target));
    }
}