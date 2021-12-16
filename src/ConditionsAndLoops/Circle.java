package ConditionsAndLoops;

import java.util.Scanner;

public class Circle {
  public static void main(String[] args) {
    final double PI = 3.14;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the radius of Circle: ");
    double radius = in.nextDouble();
    double perimeter = 2 * PI * radius;

    double area = PI * (radius * radius);
    System.out.println("Area of Circle: " + area);
    System.out.println("Perimeter of Circle: " + perimeter + " Cm");
    in.close();
  }
}
