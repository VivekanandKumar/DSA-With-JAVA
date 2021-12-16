package ConditionsAndLoops;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Year : ");
        int year = in.nextInt();
        if (String.valueOf(year).length() > 4 || String.valueOf(year).length() < 4) {
            System.out.println("Please enter a valid year");
        } else {
            if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
        in.close();
    }
}
