package Searching;

public class Search {

    static int findSqrt(int x) {
        int start = 0;
        int end = x / 2;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid > x)
                end = mid - 1;
            else if (mid * mid < x) {
                start = mid + 1;
                ans = mid;
            } else
                return mid;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findSqrt(1000000000));
        System.out.println(Math.sqrt(1000000000));
    }
}
