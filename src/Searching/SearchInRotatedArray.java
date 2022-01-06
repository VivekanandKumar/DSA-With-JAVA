package Searching;

public class SearchInRotatedArray {

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int pivot = findPivot(arr);

        if (pivot == -1) {
            return binarySearch(arr, target, start, end);
        }
        if (target == arr[pivot])
            return pivot;

        if (target >= arr[start]) {
            end = pivot - 1;
            return binarySearch(arr, target, start, end);
        }
        return binarySearch(arr, target, pivot + 1, end);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (end > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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
        int[] arr = {5, 6, 7, 9, -10, 1, 2, 3, 4};
        int target = 1;
        System.out.println(search(arr, target));
    }
}
