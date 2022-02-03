package Sorting;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {

    static List<Integer> findAllDuplicate(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1])
                swap(arr, i, arr[i] - 1);
            else
                i++;
        }
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] != x + 1) {
                list.add(arr[x]);
            }
        }
        return list;
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findAllDuplicate(arr));
    }
}
