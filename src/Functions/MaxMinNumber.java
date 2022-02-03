package Functions;

import java.util.Scanner;

public class MaxMinNumber {
    static int maxNumber(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    static int minNumber(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(maxNumber(a, b, c) + " is maximum");
        System.out.println(minNumber(a, b, c) + " is minimum");
        in.close();
    }
}
