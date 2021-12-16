package ConditionsAndLoops;

import java.util.Scanner;

/*
Write a program to print the sum of negative numbers, sum of positive even numbers and
the sum of positive odd numbers from a list of numbers (N) entered by the user.
The list terminates when the user enters a zero.
*/
public class PrintNumberSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int evenSum = 0;
        int oddSum = 0;
        int negativeSum = 0;
        do {
            System.out.println("Enter a number: ");
            num = in.nextInt();
            if (num == 0)
                break;
            if (num > 0) {
                if (num % 2 == 0) {
                    evenSum = evenSum + num;
                    System.out.println("Even number sum : " + evenSum);
                    System.out.println("Odd number sum : " + oddSum);
                    System.out.println("Negative number sum : " + negativeSum);
                } else {
                    oddSum = oddSum + num;
                    System.out.println("Even number sum : " + evenSum);
                    System.out.println("Odd number sum : " + oddSum);
                    System.out.println("Negative number sum : " + negativeSum);
                }
            } else {
                negativeSum = negativeSum + num;
                System.out.println("Even number sum : " + evenSum);
                System.out.println("Odd number sum : " + oddSum);
                System.out.println("Negative number sum : " + negativeSum);
            }
        } while (num != 0);

        in.close();
    }
}
