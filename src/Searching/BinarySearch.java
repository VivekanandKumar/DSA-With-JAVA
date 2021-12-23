package Searching;

public class BinarySearch {
    static boolean orderAgnostic(int[] arr) {
        //return true and false for descending and ascending order respectively;
        return arr[0] > arr[arr.length - 1];

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //find mid element.
            int mid = start + (end - start) / 2;
            //if we use (start+end)/2 it might possible that the
            // mid value exceeds the range of integer thats why we
            //use an efficient way of find mid element.
            //start + end-start / 2; ==> (2*start + end - start )/ 2 => [start + end / 2];
            //hence the formula remain same as previews but it never exceeds the range of integer.
            if (target == arr[mid])
                return mid;
            if (orderAgnostic(arr)) {
                if (target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (target > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1; // if the target element not exist in given array.
    }

    public static void main(String[] args) {
//        The array must be sorted in any order .
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {90, 86, 67, 65, 50, 45, 20};
        int target = 45;
        System.out.println(binarySearch(arr, target));
    }

}