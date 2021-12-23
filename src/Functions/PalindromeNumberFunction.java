package Functions;

import java.util.Scanner;

public class PalindromeNumberFunction {

    public static boolean palindrome(int num) {
        int number = num;
        int result = 0;
        while (num > 0) {
            int temp = num % 10;
            num = num / 10;
            result = result * 10 + temp;
        }
        return result == number;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        if (palindrome(number)) {
            System.out.println("Given Number is palindrome");
        } else {
            System.out.println("Given Number is not palindrome");
        }
        in.close();
    }
}
