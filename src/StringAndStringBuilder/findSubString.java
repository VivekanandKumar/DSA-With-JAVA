package StringAndStringBuilder;
//https://leetcode.com/problems/implement-strstr/
public class findSubString {
    static int find(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if (nlen > hlen)
            return -1;

        if (nlen == 0)
            return 0;

        for (int i = 0; i <= hlen - nlen; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, nlen + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String h = "haeyy";
        String n = "yy";
        System.out.println(find(h, n));
    }
}
