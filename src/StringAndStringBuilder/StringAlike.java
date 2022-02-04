package StringAndStringBuilder;

//https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class StringAlike {
    static boolean isAlike(String s) {
        int halves = s.length() / 2;
        int c1 = 0;
        int c2 = 0;
        String str1 = s.substring(0, halves).toLowerCase();
        String str2 = s.substring(halves, halves * 2).toLowerCase();
        for (int i = 0; i < halves; i++) {
            char c = str1.charAt(i);
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> c1++;
            }
        }

        for (int i = 0; i < halves; i++) {
            char c = str2.charAt(i);
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> c2++;
            }
        }
        return c1 == c2;
    }

    public static void main(String[] args) {
        String str = "book";
        System.out.println(isAlike(str));
    }
}
