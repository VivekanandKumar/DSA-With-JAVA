package StringAndStringBuilder;
//https://leetcode.com/problems/length-of-last-word/
public class LastWordLength {
    static int lastlength(String str) {
        str = str.trim();
        int i = str.length() - 1;
        boolean flag = true;
        while (i >= 0 && flag) {
            if (str.charAt(i) == ' ')
                flag = false;
            else
                i--;
        }
        return str.length() - i - 1;
    }


    public static void main(String[] args) {
        String str = "a";
        System.out.println(lastlength(str));
    }
}
