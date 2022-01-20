package Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    //find the maximum element in given range of an array
    static int findMax(int[] arr, int end) {
        int max = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    //swap the array elements.
    static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    static void sort(int[] arr) {
        int end = arr.length - 1;

        while (end > 0) {
            int max = findMax(arr, end);
            swap(arr, max, end);
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
