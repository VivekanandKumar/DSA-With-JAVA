package StringAndStringBuilder;
//https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {

    static boolean isValid(String str) {
        int i = 0;
        int j = str.length() - 1;
        str = str.toLowerCase();
        while (i <= j) {
            if (!Character.isLetterOrDigit(str.charAt(i)))
                i++;
            else if (!Character.isLetterOrDigit(str.charAt(j)))
                j--;
            else if (str.charAt(i) != str.charAt(j))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "veve";
        System.out.println(isValid(str));
    }
}
