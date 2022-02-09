package StringAndStringBuilder;
//https://leetcode.com/problems/merge-strings-alternately/
public class MergeString {
    static String merged(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int m = word1.length();
        int n = word2.length();
        int max = m > n ? m : n;
        for (int i = 0; i < max; i++) {
            if (i < m)
                ans.append(word1.charAt(i));
            if (i < n)
                ans.append(word2.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String w1 = "abc";
        String w2 = "pqrst";
        System.out.println(merged(w1, w2));
    }
}
