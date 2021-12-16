package ConditionsAndLoops;

import java.util.Scanner;

// Subtract the Product and Sum of Digits of an Integer
// result = (product of digits of integer) - (sum of digits of integer)
// number = 324;
//product = 3 * 2* 4 = 24;
//sum = 3 + 2 + 4 = 9;
//result = 24 - 9 = 15
public class Sub_ProdSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int prod = 1;
        int result;

        System.out.println("Enter an integer value: ");
        int number = in.nextInt();
        while (number > 0) {
            int temp = number % 10;
            number = number / 10;
            prod = prod * temp;
            sum = sum + temp;
        }

        result = prod - sum;
        System.out.println("Result: " + result);

        in.close();
    }
}
