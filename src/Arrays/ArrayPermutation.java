package Arrays;

/*
Generate an array of permutation on given array :
Array : [1,2,3,4,4,5]
Constraint :
answer[i] = arr[arr[i]];
answer.length == arr.length

output  : [2,3,4,4,4,5];
 */
public class ArrayPermutation {

    public static int[] buildArray(int[] num) {

        int[] answer = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            answer[i] = num[num[i]];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 4, 5};
        for (int item : input) {
            if (item >= input.length) {
                System.out.println("Array must consist of values from 0 to " + (input.length - 1) + " only");
                return;
            }
        }
        for (int item : buildArray(input)) {
            System.out.print(item + " ");
        }
    }
}