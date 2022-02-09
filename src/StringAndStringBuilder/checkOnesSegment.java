package StringAndStringBuilder;
//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
public class checkOnesSegment {
    static boolean checkOnes(String str) {
        int i = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0')
                break;
        }
        for (int j = i; j < str.length(); j++) {
            if (str.charAt(j) == '1')
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "110";
        System.out.println(checkOnes(str));
    }
}
