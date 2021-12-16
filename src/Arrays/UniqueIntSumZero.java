package Arrays;

import java.util.Arrays;

public class UniqueIntSumZero {

    static int[] uniqueSum(int n){
        int[] answer = new int[n];
        if (n % 2 == 0) {
            for (int i = 1, j = 0; i <= n / 2; i++, j += 2) {
                answer[j] = i;
                answer[j + 1] = -(answer[j]);
            }
        }
        if (n % 2 == 1) {
            answer[0] = 0;
            for (int i = 1, j = 1; i <= n / 2; i++, j += 2) {
                answer[j] = i;
                answer[j + 1] = -(answer[j]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(uniqueSum(n)));
    }
}
