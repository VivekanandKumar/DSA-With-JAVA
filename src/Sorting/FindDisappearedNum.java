package Sorting;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

import static Sorting.CyclicSort.swap;

public class FindDisappearedNum {
    static List<Integer> find(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex])
                swap(arr, i, correctIndex);
            else
                i++;
        }
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1)
                list.add(index + 1);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
//        find(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(find(arr));
    }

}
