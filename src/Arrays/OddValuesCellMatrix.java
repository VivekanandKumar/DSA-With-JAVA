package Arrays;

import java.util.Arrays;

public class OddValuesCellMatrix {

    static int oddValue(int m,int n,int[][] indices){
        int count =0;
        int[][] answer = new int[m][n];

        for(int i=0;i< indices.length;i++){
//            for rows increments.
            int row = indices[i][0];
            for(int j=0;j<n;j++){
                answer[row][j]++;
            }
//            for column increments.
            int col = indices[i][1];
            for(int k=0;k<m;k++){
                answer[k][col]++;
            }
        }

        //printing the answer matrix.
        for (int[] item : answer){
            System.out.println(Arrays.toString(item));
        }
        for(int[] cells : answer){
            for (int item : cells){
                if(item % 2 !=0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int m =4;
        int n = 6;
        int[][] indices ={
                {0,0},
                {1,0}
        };
        System.out.println("Odd Values: "+oddValue(m,n,indices));
    }
}
