package StringAndStringBuilder;

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class StringArrayEquivalent {

    static boolean isEquivalent(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (String word : word1)
            str1.append(word);

        for (String word : word2)
            str2.append(word);
        return str1.toString().equals(str2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"a", "bc"};
        String[] word2 = {"ab", "c"};
        System.out.println(isEquivalent(word1, word2));
    }
}
