package Arrays;

import java.util.Arrays;

public class MaxPopulationYear {
    public static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        int max = 0;
        int year = 1950;
        for (int[] log : logs) {
            for (int j = log[0]; j < log[1]; j++) {
                arr[j - 1950]++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int k = 0; k < arr.length; k++) {
            if (max < arr[k]) {
                max = arr[k];
                year = k + 1950;
            }
        }
        return year;
    }

    public static void main(String[] args) {
        int[][] log = {
                {1993, 1999}, {2000, 2010}
        };
        int arr = maximumPopulation(log);

        System.out.println(arr);
    }
}
