package StringAndStringBuilder;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseString3 {
    static String reverse(String str) {
        StringBuilder answer = new StringBuilder();
        int length = str.length();
        int j = length - 1;
        for (int x = length - 1; x >= 0; x--) {
            if (str.charAt(x) == ' ') {
                answer.append(str, x + 1, j + 1).append(" ");
                j = x - 1;
            }
            if (x == 0)
                answer.append(str, x, j + 1);
        }
        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverse(str));
    }
}
