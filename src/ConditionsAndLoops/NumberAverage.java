package ConditionsAndLoops;

import java.util.Scanner;

public class NumberAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number : ");
        int num = in.nextInt();

        float avg = (float) (1 + num) / 2;

        System.out.println("Average of " + num + " : " + avg);
        in.close();
    }
}
