package Sorting.CyclicSort;

import java.util.Arrays;
//cyclic sort is helpful when the array contain numbers from 1 to n and not contain duplicate elements.;
public class CyclicSort {


    static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i] != arr[correctIndex])
                swap(arr,i,correctIndex);
            else
                i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,6,3,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
