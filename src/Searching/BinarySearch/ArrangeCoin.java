package Searching.BinarySearch;
//https://leetcode.com/problems/arranging-coins/submissions/
public class ArrangeCoin {



    public static void main(String[] args) {
        System.out.println(coin(9));
    }

    private static int coin(int i) {
//      O(1) time complexity.
//        return (int)(Math.sqrt(2*(long)i + 0.25 ) - 0.5 );

//        O(logN) time complexity.


        long start = 1;
        long end = i;
        while (start <= end){
            long mid = start + (end-start)/2;
            long ans = mid*(mid+1)/2;
            if (ans <= i){
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return (int)end;
    }
}
