package Searching;

import java.util.Arrays;

public class BinarySearch {

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;//if we use (start+end)/2 it might possible that the
            // mid value exceeds the range of integer thats why we
            //use an efficient way of find mid element.
            //start + end-start / 2; ==> 2start + end - start / 2 => [start + end / 2];
            //hence the formula remain same as previews but it never exceeds the range of integer.
            if (target == arr[mid])
                return mid;
            else if (target > arr[mid])
                start = mid+1;
            else if (target < arr[mid])
                end = mid-1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
//        Arrays.sort(arr);
        System.out.println(binarySearch(arr,target));
    }
}
