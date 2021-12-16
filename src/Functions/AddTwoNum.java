package Functions;

import java.util.Scanner;

public class AddTwoNum {

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Sum of " + a + " and " + b + " : " + sum(a, b));
        in.close();
    }
}