package StringAndStringBuilder;
//https://leetcode.com/problems/long-pressed-name/
public class LongPressedName {
    static boolean isLongPressed(String name, String typed) {
        int i = 0;
        int j = 0;
        while (j < typed.length()) {
            if (i < name.length() && typed.charAt(j) == name.charAt(i)) {
                i++;
                j++;
            } else {
                if (j != 0 && typed.charAt(j) == name.charAt(i - 1)) {
                    j++;
                } else
                    return false;
            }
        }
        return i == name.length();
    }

    public static void main(String[] args) {
        String name = "saeed";
        String typed = "saaaed";
        System.out.println(isLongPressed(name, typed));
    }
}
