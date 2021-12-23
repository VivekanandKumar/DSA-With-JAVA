package Functions;

import java.util.Scanner;

/*
A Pythagorean triplet is when the sum of the square of two number is equal to the square of the third number.
*/
public class PythagoreanTriplet {

    public static boolean isTriplet(int a, int b, int c) {
        return (Math.pow(a, 2) + Math.pow(b, 2)) == (Math.pow(c, 2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three integer number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("First Number: " + a + "\nSecond Number: " + b + "\nThird Number : " + c);
        if (isTriplet(a, b, c)) {
            System.out.println("Given Numbers are Pythagorean triplet");
        } else {
            System.out.println("Given Numbers are not Pythagorean triplet");
        }
        in.close();
    }
}
