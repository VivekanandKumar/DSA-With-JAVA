package StringAndStringBuilder;

public class SplitStringPalindrome {

    static boolean isPalindrome(String a, String b) {
        return checkPalindrome(a,b) || checkPalindrome(b,a);
    }
    static boolean checkPalindrome(String a,String b){
        int start = 0;
        int end = a.length() - 1;
        while (start < end && a.charAt(start) == b.charAt(end)) {
            start++;
            end--;
        }
        if (start >= end) return true;
        return check(a.substring(start, end + 1)) || check(b.substring(start, end + 1));
    }
    static boolean check(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end && str.charAt(start) == str.charAt(end)) {
            start++;
            end--;
        }
        return start >= end;
    }

    public static void main(String[] args) {
        String a = "abdef";
        String b = "fecab";
        System.out.println(isPalindrome(a, b));
    }
}
