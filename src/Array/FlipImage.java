package Array;

import java.util.Arrays;

/*
1st step : Horizontally flip the image.
i.e : if array is [0,1,1] then flipped-image is [1,1,0].

2nd step : Invert the image.
i.e : if array is [1,0,1] then inverted image is [0,1,0]

Input : [0,1,0]
        [0,0,1]
        [1,1,0]

Output : [1,0,1]
         [0,1,1]
         [1,0,0]
 */
public class FlipImage {


    static void flip(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int s = 0, e = arr[i].length - 1; s < e; s++, e--) {
                int temp = arr[i][s];
                arr[i][s] = arr[i][e];
                arr[i][e] = temp;
            }
        }
    }

    static int[][] invert(int[][] arr) {
        flip(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                } else if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 0}
        };
        for (int[] item : invert(arr)) {
            System.out.println(Arrays.toString(item));
        }
    }
}