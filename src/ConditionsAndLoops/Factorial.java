package ConditionsAndLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter an integer value: ");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + ": " + fact);

        in.close();
    }
}
