package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
given array : [1,2,3,4] , k = 4;
return array : 1234 + k : 1234 + 4 = 1238 :-- No. of digit same as input.
output array : [1,2,3,8] into a List.

given array : [9,9,9,9] , k = 4;
return array : 9999 + k : 9999 + 4 = 10003; :-- No. of digit in input is 4 but in output there are 5 digit.
output array : [1,0,0,0,3] into a List.

Constraint :
0 < array.length <= 10^4
 */
public class AddArray {

    static List<Integer> addArray(int[] arr,int k){
        List<Integer> answer = new ArrayList<>();
        int i = arr.length-1;
        while(i >=0 || k > 0){
            if(i >=0){
                answer.add((arr[i] + k)%10);
                k = (arr[i]+k) / 10;
            }else{
                answer.add(k%10);
                k = k/10;
            }
            i--;
        }
        Collections.reverse(answer);
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        int k =8;
        System.out.println(addArray(arr,k));
    }
}