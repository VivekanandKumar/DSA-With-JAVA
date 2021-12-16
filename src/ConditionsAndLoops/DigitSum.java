package ConditionsAndLoops;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            num = num / 10;
            sum = sum + temp;
        }
        System.out.println("Sum of Digits of the given number : " + sum);
        in.close();
    }
}
