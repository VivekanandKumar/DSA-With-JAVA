package ConditionsAndLoops;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of side (CM): ");
        double length = in.nextDouble();

        double perimeter = 4 * length;

        System.out.println("Perimeter of Square: " + perimeter + " Cm");
        in.close();
    }
}
