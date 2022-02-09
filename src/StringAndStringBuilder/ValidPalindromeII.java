package StringAndStringBuilder;
//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeII {

    static boolean isValid(String str) {
        int i = 0;
        int j = str.length() - 1;
        int skipStart = 0;
        int skipEnd = 0;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                i++;
                skipStart++;
            }
        }
        i = 0;
        j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                j--;
                skipEnd++;
            }
        }
        if (skipStart == 1 || skipEnd == 1)
            return true;
        return skipStart == 0 || skipEnd == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("deeee"));
    }
}
