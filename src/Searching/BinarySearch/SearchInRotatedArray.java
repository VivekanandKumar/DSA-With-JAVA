package Searching.BinarySearch;

//  Search in rotated sorted array with distinct value(no duplicate values);
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
//            this will execute when duplicate elements present in the start and end of an array;
//            then it will ignore the duplicate elements
            while (start < end && arr[start] == arr[start + 1])
                start++;
            while (start < end && arr[end] == arr[end - 1])
                end--;
//            till here
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
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
//        int[] arr = {3, 3, 3, 3, 4, 5, 1, 2, 3, 3};
//        int[] arr = {6,1,3,4,5};
        int target = 2;
        System.out.println(search(arr, target));
//        System.out.println(findPivot(arr));
    }
}
