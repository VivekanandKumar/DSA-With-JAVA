package Arrays;

import java.util.Arrays;

/*
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 */
public class ArrayItemSmallerNumber {

    static int[] smallerItems(int[] arr) {
        int count = 0;
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int k : arr) {
                if (k < arr[i]) {
                    count++;
                }
            }
            answer[i] = count;
            count = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 93, 1, 3, 12, 0};
        System.out.println(Arrays.toString(smallerItems(arr)));
    }
}
