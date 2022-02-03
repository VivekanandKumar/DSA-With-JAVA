package Array;

public class StringPangram {
    public static boolean checkPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        if (sentence.length() < 26) {
            return false;
        } else {
            for (char ch : alphabet.toCharArray()) {
                if (sentence.indexOf(ch) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkPangram(sentence));
    }
}
