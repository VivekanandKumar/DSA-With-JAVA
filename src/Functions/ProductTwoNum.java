package Functions;

import java.util.Scanner;

public class ProductTwoNum {

    static double prod(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Product of " + a + " and " + b + " : " + prod(a, b));
        in.close();
    }
}
