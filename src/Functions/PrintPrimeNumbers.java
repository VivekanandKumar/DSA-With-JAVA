package Functions;

import java.util.Scanner;

public class PrintPrimeNumbers {

    static String primeNumbers(int a, int b) {
        String primeNumbers = "";
        for (int i = a; i <= b; i++) {
            if (PrimeNumberFunction.isPrime(i)) { // used pre defined function in conditions and loops folder.
                primeNumbers += i + " ";
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range of numbers (e.g: 1 100) : ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.println("Enter a valid incremental range of numbers");
        } else {
            System.out.println("Prime Number from " + a + " to " + b + " : \n" + primeNumbers(a, b));
        }
        in.close();
    }
}
