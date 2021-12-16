package Arrays;

import java.util.Arrays;

/*
Generate an array of su of given array like this :
ans[i] = ans[i]+ ans[i-1];

e.g :
array : []1,2,3,4]
answer : [1,3,6,10]
 */
public class ArraySum {
    static int[] sumArray(int[] arr) {
        int[] answer = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            answer[i] = sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 6};
        System.out.println(Arrays.toString(sumArray(arr)));
    }
}
