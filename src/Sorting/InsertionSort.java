package Sorting;
import java.util.Arrays;

public class InsertionSort {

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
                else
                    break;
            }
        }
    }
    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 0, -9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}