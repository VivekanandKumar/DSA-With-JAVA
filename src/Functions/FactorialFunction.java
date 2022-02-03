package Functions;

import java.util.Scanner;

public class FactorialFunction {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Factorial of " + num + " is : " + factorial(num));
        in.close();
    }
}
