package Array;

import java.util.Arrays;

public class ArrayExamples {

    static void swapArrayElements(int[] arr, int x, int y) {
        arr[x] = arr[x] * arr[y];
        arr[y] = arr[x] / arr[y];
        arr[x] = arr[x] / arr[y];
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swapArrayElements(arr, start, end);
            start++;
            end--;
        }
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static boolean arrayPalindrome(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        reverseArray(arr);
        return Arrays.equals(arr, temp);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1};

        if (arrayPalindrome(arr)) {
            System.out.println("Array is palindrome");
        } else {
            System.out.println("Array is not palindrome");
        }
    }
}