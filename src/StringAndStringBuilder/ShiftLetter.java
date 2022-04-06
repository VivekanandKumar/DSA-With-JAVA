package StringAndStringBuilder;

public class ShiftLetter {

    static String shift(String str,int[] shifts){
        StringBuilder ans = new StringBuilder();
        int total = 0;
        for (int i=shifts.length-1; i>=0; i--){
            shifts[i] = (total + shifts[i])%26;
            total = shifts[i];
        }
        for (int i=0;i<str.length();i++){
            int correctShift = (str.charAt(i) - 'a'+shifts[i]) % 26;
            ans.append((char)('a'+correctShift));
        }
        return ans.toString();
    }


    public static void main(String[] args) {
        String s = "abc";
        int[] arr = {3,5,9};
        System.out.println(shift(s,arr));//rul
//        int shift = (26+98) % 26;
//        System.out.println((char)(97+shift));

    }
}
