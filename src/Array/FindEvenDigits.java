package Array;

public class FindEvenDigits {

    static int digit(int[] arr) {
        int digitSum = 0;
        int evenDigit = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                arr[i] = arr[i] / 10;
                digitSum++;
            }
            if (digitSum % 2 == 0) {
                evenDigit++;
            }
            digitSum = 0;
        }
        return evenDigit;
    }

    public static void main(String[] args) {
        int[] arr = {1, 45, 67, 111};
        System.out.println(digit(arr));
    }
}
