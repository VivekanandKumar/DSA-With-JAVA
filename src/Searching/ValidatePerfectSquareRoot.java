package Searching;
//  https://leetcode.com/problems/valid-perfect-square/
public class ValidatePerfectSquareRoot {
    static boolean validSquareRoot(int num) {
        long start = 1;
        long end = num/2;
        if (num==1)
            return true;
        while(start<=end){
            long mid = start + (end-start)/2;

            if(mid*mid == num)
                return true;
            else if(mid*mid > num)
                end=mid-1;
            else
                start = mid+1;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 1;
        System.out.println(validSquareRoot(num));
    }
}
