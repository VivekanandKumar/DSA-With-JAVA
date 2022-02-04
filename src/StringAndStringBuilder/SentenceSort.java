package StringAndStringBuilder;

//https://leetcode.com/problems/sorting-the-sentence/
public class SentenceSort {
    static String sort(String str) {
        StringBuilder answer = new StringBuilder();
        String[] arr = str.split(" ");
        String[] ans = new String[arr.length];
        for (String x : arr) {
            char temp = x.charAt(x.length() - 1);
            ans[Character.getNumericValue(temp) - 1] = x.substring(0, x.length() - 1);
        }
        for (String s : ans)
            answer.append(s + " ");

        return answer.toString().trim();
    }


    public static void main(String[] args) {

        String str = "is2 sentence4 This1 a3";
//        sort(str);
        System.out.println(sort(str));
    }
}
