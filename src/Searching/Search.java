package Searching;

public class Search {

    static int search(int[] arr, int target) {
        boolean notFound = true;
        int index = 0;
        while (notFound) {
            if (arr[index] == target)
                notFound = false;
            else
                index++;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 9, 10};
        int target = 5;
        System.out.println(search(arr, target));
    }
}
