package Sorting;
//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    static int missingNumber(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex])
                swap(arr,i,correctIndex);
            else
                i++;
        }
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] != x ) {
                return x ;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int x,int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }
}
