package Functions;

import java.util.Scanner;

public class SumNaturalNumbers {

    static int sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int n = in.nextInt();
        if (n == 0) {
            System.out.println("0 is not a natural number!!");
        } else {
            System.out.println("Sum of first " + n + " natural numbers: " + sum(n));
        }
        in.close();
    }
}
