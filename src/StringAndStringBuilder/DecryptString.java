package StringAndStringBuilder;

//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class DecryptString {
    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        String s = "10#11#12";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                int n = Integer.parseInt(s.substring(i - 2, i));
                ans.append((char) ('a' + n - 1));
                i -= 2;
            } else {
                int n = Character.getNumericValue(s.charAt(i));
//                int n = s.charAt(i)-'0';
                ans.append((char) ('a' + n - 1));
            }
        }
        System.out.println(ans.reverse());
    }
}
