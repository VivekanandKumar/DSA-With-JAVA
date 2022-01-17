package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    //    swap the array elements.
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void bubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
//            if in first inner loop the array element never swapped thats means the given array is sorted
//            So, end the program.
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
