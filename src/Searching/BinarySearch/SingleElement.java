package Searching.BinarySearch;

public class SingleElement {
    static int singleElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid >= 1 && arr[mid] == arr[mid - 1]) {
                if (mid % 2 == 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (mid < arr.length - 1 && arr[mid] == arr[mid + 1]) {
                if (mid % 2 != 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else
                return arr[mid];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 7, 7, 10, 11, 11};
        System.out.println(singleElement(arr));
    }
}
