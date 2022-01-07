package Array;

/*
given an array of integer, create an answer array of ( 2 * array.length )
concat the given array and store into answer array.
e.g:
array : [1,2,3,4]
answer : [1,2,3,4,1,2,3,4]
 */
public class ArrayConcatenation {

    public static int[] arrayCocat(int[] arr){
        int[] answer = new int[2*arr.length];
        for(int i=0;i<arr.length;i++){
            answer[i] = arr[i];
            answer[arr.length+i] = arr[i];
        }
        return answer;
    }
    public static void main(String[] args) {

        int[] arr = {3,4,1,6};
        for (int item:arrayCocat(arr)){
            System.out.print(item+" ");
        }
    }
}
