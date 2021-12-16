package ConditionsAndLoops;

import java.util.Scanner;

public class Rectangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Length (Cm) : ");
    double length = in.nextDouble();
    System.out.println("Enter the Width (Cm) : ");
    double width = in.nextDouble();

    double area = length * width;
    double perimeter = 2 * (length + width);
    System.out.println("Area of Rectangle : " + area + " Cm");
    System.out.println("Perimeter of Rectangle: " + perimeter + " Cm");
    in.close();
  }
}
