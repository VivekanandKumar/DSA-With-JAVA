package StringAndStringBuilder;

public class SplitStringWays {

    static int numWays(String str) {
        int MOD = (int)Math.pow(10, 9) + 7;
        long len = str.length();
        int totalOnes = (int) str.chars().filter(c -> c == '1').count();
        if (totalOnes % 3 != 0)
            return 0;
        if (totalOnes == 0) {
            return (int)((len - 1) * (len - 2) / 2 % MOD);
        }
        int onesGroup = totalOnes / 3;
        int counter = 0;
        int firstBlock = 0;
        int secondBlock = 0;
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c == '1')
                counter++;
            i++;
            if (counter == onesGroup)
                firstBlock++;
            else if (counter == 2 * onesGroup)
                secondBlock++;
        }
        return firstBlock * secondBlock % MOD;
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(numWays(s));
    }
}
