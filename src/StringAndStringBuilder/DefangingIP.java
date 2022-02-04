package StringAndStringBuilder;
//https://leetcode.com/problems/defanging-an-ip-address/

// input = "1.1.1.1";
//output : 1[.]1[.]1[.]1

public class DefangingIP {

    static String defanging(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (str.charAt(i) == '.')
                ans.append("[.]");
            else
                ans.append(temp);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "1.1.1.1";
        System.out.println(defanging(str));
    }
}
