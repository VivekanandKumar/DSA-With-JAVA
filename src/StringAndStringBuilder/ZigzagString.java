package StringAndStringBuilder;
//https://leetcode.com/problems/zigzag-conversion/
public class ZigzagString {
    static String zigzag(String str, int row) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < row; i++) {
            int increment = 2 * (row - 1);
            for (int j = i; j < str.length(); j += increment) {
                ans.append(str.charAt(j));
                int midInc = j + increment - 2 * i;
                if (i > 0 && i < row - 1 && midInc < str.length()) {
                    ans.append(str.charAt((midInc)));
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "paypalishiring";
        System.out.println(zigzag(str, 5));
    }
}
