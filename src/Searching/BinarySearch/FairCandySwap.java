package Searching.BinarySearch;
//https://leetcode.com/problems/fair-candy-swap/

import java.util.Arrays;

public class FairCandySwap {
    static int total(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    static int[] swap(int[] num1, int[] num2) {
        int sum1 = total(num1);
        int sum2 = total(num2);
        for (int i = num1.length - 1; i >= 0; i--) {
            for (int j = num2.length - 1; j >= 0; j--) {
                int diff = num1[i] - num2[j];
                if ((sum1 - diff) == (sum2 + diff)) {
                    return new int[]{num1[i], num2[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        int[] num1 = {1, 1};
        int[] num2 = {2, 2};

        System.out.println(Arrays.toString(swap(num1, num2)));
    }
}
