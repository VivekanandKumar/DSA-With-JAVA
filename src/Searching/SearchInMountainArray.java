package Searching;

public class SearchInMountainArray {

    public static void main(String[] args) {
        int[] arr = {0, 5, 3, 1};
        int target = 1;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = MountainPeakElement.peak(arr);
        int firstTry = Ordersearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return Ordersearch(arr, target, peak + 1, arr.length - 1);
    }

    static int Ordersearch(int[] arr, int target, int start, int end) {
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

}
