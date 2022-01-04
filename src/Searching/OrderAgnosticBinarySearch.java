package Searching;

public class OrderAgnosticBinarySearch {

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid])
                return mid;

            if (isAscending) {
//                search in Ascending order array
                if (arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
//                search in Descending order array
                if (arr[mid] < target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] arr = {4,7,9,19,33,46,78,100};
        int[] arr = {200, 70, 43, 22, 11, 10, 8, 2, 0, -10};
        int target = -10;
        System.out.println(search(arr, target));
    }
}
