package ConditionsAndLoops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integer numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int max = a > b ? a : b;
        for (int x = max; x <= a * b; x += max) {
            if (x % a == 0 && x % b == 0) {
                System.out.println("Lcm of " + a + " and " + b + " is : " + x);
                break;
            }
        }
        in.close();
    }
}