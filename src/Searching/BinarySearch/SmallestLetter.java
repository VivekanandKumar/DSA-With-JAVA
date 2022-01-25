package Searching.BinarySearch;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

// find smallest letter greater than target.
public class SmallestLetter {

    static char findLetter(char[] arr,char target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;

            if(arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return arr[start % arr.length];
    }
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'd';
        System.out.println(findLetter(arr,target));
    }
}
