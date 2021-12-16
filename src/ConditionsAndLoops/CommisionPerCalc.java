package ConditionsAndLoops;

import java.util.Scanner;

public class CommisionPerCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        double amount = in.nextDouble();
        System.out.println("Enter commissioned amount: ");
        double comAmount = in.nextDouble();

        double comPercentage = (comAmount * 100) / amount;
        System.out.println("Commision percentage = " + comPercentage + "%");
        in.close();
    }
}
