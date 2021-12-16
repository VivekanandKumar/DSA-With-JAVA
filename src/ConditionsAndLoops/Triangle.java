package ConditionsAndLoops;

import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Base in CM : ");
    double base = in.nextDouble();
    System.out.println("Enter the Height in CM : ");
    double height = in.nextDouble();

    double area = (base * height) / 2;
    System.out.println("Area of Triangle : " + area + " CM");
    in.close();
  }
}
