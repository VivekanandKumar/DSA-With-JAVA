package ConditionsAndLoops;

import java.util.Scanner;

public class DistanceCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter co-ordinate of first point (X1 , Y1): ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Enter co-ordinate of second point (X2 , Y2): ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("Distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") : " + distance);
        in.close();
    }
}
