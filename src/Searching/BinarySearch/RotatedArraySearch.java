package Searching.BinarySearch;

public class RotatedArraySearch {

    static int[] ignoreDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end && arr[start] == arr[start+1])
            start++;
        while(start < end && arr[end] == arr[end-1])
            end--;
        return new int[]{start,end};
    }





    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1};
        int start = ignoreDuplicates(arr)[0];
        int end = ignoreDuplicates(arr)[1];
        for (int x=start;x<=end;x++){
            System.out.print(arr[x]+" ");
        }
    }
}
