package Arrays;

public class DiagonalSum {

    static int sum(int[][] matrix, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else if ((i + j) == n - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {4, 5, 1, 7},
                {4, 7, 2, 9},
                {1, 1, 1, 1}
        };
        System.out.println(sum(arr, arr.length));
    }
}
