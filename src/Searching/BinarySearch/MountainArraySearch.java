package Searching.BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArraySearch {
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[mid+1])
                end = mid;
            else
                start = mid+1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {0,8,9,1,6,3,19,-19};
        System.out.println(peak(arr));
    }
}
