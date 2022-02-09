package StringAndStringBuilder;
//https://leetcode.com/problems/valid-parentheses/
import java.util.Stack;
public class ValidParentheses {

    static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack.add(ch);
            else {
                if (stack.isEmpty()) return false;
                if (ch == ')' && stack.peek() != '(') return false;
                if (ch == '}' && stack.peek() != '{') return false;
                if (ch == ']' && stack.peek() != '[') return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(])";
        System.out.println(isValid(str));
    }
}
