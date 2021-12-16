package ConditionsAndLoops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;

        System.out.println("Enter the length of series: ");
        int length = in.nextInt();

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < length; i++) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(b + " ");
        }
        in.close();
    }
}