package StringAndStringBuilder;
//https://leetcode.com/problems/reverse-prefix-of-word/
public class ReversePrefix {
    static String reverse(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == 0)
            return word;
        StringBuilder ans = new StringBuilder(word.substring(0, index + 1));
        ans.reverse().append(word.substring(index + 1));
        return ans.toString();
    }


    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reverse(word, ch));
    }
}
