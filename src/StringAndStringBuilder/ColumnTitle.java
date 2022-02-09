package StringAndStringBuilder;
//https://leetcode.com/problems/excel-sheet-column-title/
public class ColumnTitle {

    static String title(int col) {

        StringBuilder ans = new StringBuilder();
        while (col > 0) {
            int k = (col - 1) % 26;
            ans.append((char) (65 + k));
            col = (col - 1) / 26;
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        int col = 262821;
        System.out.println(title(col));
    }
}
