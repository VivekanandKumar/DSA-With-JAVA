package StringAndStringBuilder;
//https://leetcode.com/problems/maximum-repeating-substring/
public class MaxRepeatSubstring {
    static int maxRepeat(String str, String word) {
        int count = 0;
        boolean flag = true;
        StringBuilder s = new StringBuilder(word);
        while (flag) {
            if (str.contains(s)) {
                count++;
                s.append(word);
            } else
                flag = false;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "ababc";
        String word = "ab";
        System.out.println(maxRepeat(str, word));
    }
}
