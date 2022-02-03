package ConditionsAndLoops;

import java.util.Scanner;

public class ZeroNumbersAdd {
    public static void main(String[] args) {
        long result = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            number = sc.nextInt();
            result += number;
        } while (number != 0);
        System.out.println("Addition of all entered numbers are: " + result);
        sc.close();
    }
}
