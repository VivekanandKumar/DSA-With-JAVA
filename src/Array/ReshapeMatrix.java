package Array;

import java.util.Arrays;

public class ReshapeMatrix {

    static int[][] reshape(int[][] arr,int r,int c){
        int[][] answer = new int[r][c];
        if ((arr[0].length * arr.length != r*c) || (arr.length == r && arr[0].length == c))
            return arr;
        for (int i=0;i<r*c;i++){
            answer[i/c][i%c] = arr[i/arr[0].length][i%arr[0].length];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,5},{8,3,4}};
        int row =3;
        int col = 2;
        for (int[] item : reshape(arr,row,col)){
            System.out.println(Arrays.toString(item));
        }
    }
}
