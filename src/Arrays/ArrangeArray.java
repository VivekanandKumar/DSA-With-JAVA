package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/*
given two array :
1 . array of integer number : []
2.  array of indexes : []
>> constraint :
    array.length == index.length

we have to arrange the array elements as per index array and store in a ArrayList<Integer>.
e.g :
arr = [0,1,2,3,4]
index = [0,1,2,2,1]
ArrayList<Integer> = [0,4,1,3,2,]
*/
public class ArrangeArray {
    static int[] arrangeArray(int[] arr,int[] index){
        int[] answer = new int[arr.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(index[i],arr[i]);
        }
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(arrangeArray(arr,index)));
    }
}