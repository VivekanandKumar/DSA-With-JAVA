package Sorting;

import java.util.Arrays;

public class MergeSortedArray {

    static void merge(int[] x, int a, int[] y, int b) {
        int xIndex = a-1;
        int yIndex = b-1;
        int counter = a+b-1;
        while (yIndex >= 0){
            if (xIndex >= 0 && x[xIndex] > y[yIndex]){
                x[counter] = x[xIndex--];
            }else{
                x[counter] = y[yIndex--];
            }
            counter--;
        }
        System.out.println(Arrays.toString(x));
    }

    public static void main(String[] args) {
        int[] x = {2,0};
        int[] y = {1};
        merge(x, 1, y, 1);
    }
}
