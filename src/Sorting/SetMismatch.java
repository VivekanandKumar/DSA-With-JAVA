package Sorting;
//https://leetcode.com/problems/set-mismatch/
import java.util.Arrays;

public class SetMismatch {

    static int[] findMismatchSet(int[] arr) {
        int i=0;
        while (i< arr.length){
            if (arr[i] != arr[arr[i]-1])
                swap(arr,i,arr[i]-1);
            else
                i++;
        }
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index+1){
                return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr,int x,int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findMismatchSet(arr)));
    }
}
