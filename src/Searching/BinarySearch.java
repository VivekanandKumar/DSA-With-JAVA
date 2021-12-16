package Searching;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        for (int i=0;i<arr.length;i++){
            int mid = (start + end) / 2;
            if(arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid-1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {-1,0,4,8,10,17};
        int target = 89;
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,target));
    }
}
