package ConditionsAndLoops;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of sides (Cm) : ");
        double sideLength = in.nextDouble();

        double perimeter = 3 * sideLength;
        double area = (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);
        System.out.println("Area of Equilateral Triangle: " + area + " Cm");
        System.out.println("Perimeter of Equilateral Triangle: " + perimeter + " Cm");
        in.close();
    }
}