package StringAndStringBuilder;
//https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {

    static int romantoInt(String str) {
        int ans = number(str.charAt(str.length() - 1));
        for (int i = str.length() - 2; i >= 0; i--) {
            int num = number(str.charAt(i));
            if (num < number(str.charAt(i + 1))) {
                ans = ans - num;
            } else
                ans = ans + num;
        }
        return ans;
    }

    static int number(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(romantoInt(str));
    }
}
