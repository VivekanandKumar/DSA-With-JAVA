package ConditionsAndLoops;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive Number : ");
        int number = sc.nextInt();
        System.out.print("Factor of " + number + " are : 1");
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(" , " + i);
            }
        }
        sc.close();
    }
}
