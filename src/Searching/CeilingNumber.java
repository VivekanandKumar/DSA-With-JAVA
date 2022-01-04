package Searching;

/*
Ceiling Number  : smallest Number in an array that is greater OR equal to the target number .
arr[] = {2, 3, 5, 9, 14, 16, 18};
target = 4;

 4 is not present than the ceiling number is 5 .
 */
public class CeilingNumber {

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
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 12;
        System.out.println(ceiling(arr, target));

    }


}
