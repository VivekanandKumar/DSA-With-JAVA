package Functions;

import java.util.Scanner;

public class CircleFunction {

    static double area(double radius,double PI){
        return PI*radius*radius;
    }

    static double circumference(double radius,double PI){
        return (2*PI*radius);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of Circle: ");
        double radius =in.nextDouble();
        final double PI = 3.14;
        System.out.println("Area of circle : "+area(radius, PI));
        System.out.println("Circumference of circle : "+circumference(radius, PI));
        in.close();
    }
}
