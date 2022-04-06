package StringAndStringBuilder;

public class JumpGame7 {

    static boolean canReach(String str, int min, int max) {
        int i = 0;
        while (i < str.length() - 1) {
            for (int x = i + min; x <= i + max; x++) {
                if (str.charAt(x) == '0') {
                    i = x;
                    break;
                }
                else if (x == i+max)
                    return false;
            }
        }
        return i == str.length() - 1;
    }

    public static void main(String[] args) {
        String str = "01101110";
        System.out.println(canReach(str, 2, 3));
//        System.out.println(str.);
    }
}
