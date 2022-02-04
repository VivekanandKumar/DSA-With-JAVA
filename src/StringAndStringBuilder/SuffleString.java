package StringAndStringBuilder;

//https://leetcode.com/problems/shuffle-string/
public class SuffleString {
    static String restoreString(String s, int[] indices) {
        char[] answer = new char[indices.length];
        int index = 0;
        for (int x : indices) {
            answer[x] = s.charAt(index);
            index++;
        }
        return new String(answer);
    }

    public static void main(String[] args) {
        String str = "codeleet";
        int[] arr = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(str, arr));
    }
}
