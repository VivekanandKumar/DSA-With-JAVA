package Array;

import java.util.Arrays;

/*
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
 */
public class SuffleArray {

    static int[] suffle(int[] arr, int n) {
        int[] answer = new int[2 * n];
        int k = 0;
        for (int i = 0, j = n; i < n; i++, j++, k += 2) {
            answer[k] = arr[i];
            answer[k + 1] = arr[j];
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arr = {4, 2, 7, 3, 9, 3};
        if (arr.length % 2 == 1) {
            System.out.println("Array size must be of size 2n");
        } else {
            System.out.println(Arrays.toString(suffle(arr, n)));
        }

    }
}
