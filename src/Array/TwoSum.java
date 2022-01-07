package Array;

import java.util.Arrays;

public class TwoSum {

    static int[] add(int[] arr,int target){
        int[] answer = new int[2];
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum = arr[i] + arr[j];
                if(sum == target){
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
            if (sum == target){
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 3;
        System.out.println(Arrays.toString(add(arr,target)));
    }
}
