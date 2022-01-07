package Array;

public class RichestCustomerWealth {

    static int arraySum(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            sum = sum + item;
        }
        return sum;
    }

    static int maximumWealth(int[][] arr) {
        int max = 0;

        for (int[] ints : arr) {
            if (arraySum(ints) > max) {
                max = arraySum(ints);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1},
                {1, 1, 0},
                {2, 2}
        };
        System.out.println(maximumWealth(arr));
    }
}
