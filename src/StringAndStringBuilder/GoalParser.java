package StringAndStringBuilder;

//https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParser {

    static void parser(String str) {
        StringBuilder ans = new StringBuilder();
        for (int x = 0; x < str.length(); x++) {
            if ((int) str.charAt(x) == 40) {
                if (x < str.length() - 1 && (int) str.charAt(x + 1) == 41) {
                    ans.append("o");
                    x++;
                }
            } else if ((int) str.charAt(x) > 41)
                ans.append(str.charAt(x));
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "G()()()()(al)";
        parser(str);
    }
}
