package Searching.BinarySearch;

//  https://leetcode.com/problems/sqrtx/
public class SquareRoot {
    static int mySqrt(int x) {
        long start = 0;
        long end = x;
        long ans = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid > x)
                end = mid - 1;
            else if (mid * mid < x) {
                start = mid + 1;
                ans = mid;
            } else
                return (int) mid;
        }
        //return the truncated value
        //e.g : if the square root is 2.788 then it returns 2.
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(49));
    }
}
