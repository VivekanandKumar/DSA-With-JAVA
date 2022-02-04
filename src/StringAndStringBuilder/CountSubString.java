package StringAndStringBuilder;

//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
public class CountSubString {
    public static void main(String[] args) {
        String[] str = {"a", "abc", "bc", "d"};
        String word = "abc";
        int counter = 0;
        for (String s : str) {
            if (word.contains(s))
                counter++;
        }
        System.out.println(counter);
    }
}
