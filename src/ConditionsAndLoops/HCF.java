package ConditionsAndLoops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two integer value : ");
        int a = in.nextInt();
        int b = in.nextInt();

        int min = a < b ? a : b;

        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("The H.C.F of " + a + " and " + b + " is : " + i);
                break;
            }
        }
        in.close();
    }
}