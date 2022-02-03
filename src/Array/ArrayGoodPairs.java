package Array;

/*
given an array of Integer find pairs of Integer from array.
constraint :
i < j
arr[i] == arr[j]
e.g :
array = [1,1,3,1,0,8]
so, In this array there are multiple pairs of number :
e.g : index of (0,1),(0,3),(1,3)
so, there are 3 possible pairs .
 */
public class ArrayGoodPairs {

    static int goodPair(int[] arr) {
        int pair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i < j && arr[i] == arr[j]) {
                    pair++;
                    System.out.println(i + " , " + j);
                }
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 1, 0, 8};
        System.out.println(goodPair(arr));
    }
}
