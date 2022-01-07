package Searching.LinearSearch;

public class LinearSearch {

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, -7, 89, 0, -19};
        int target = 0;
        System.out.println(linearSearch(arr, target));
    }
}
