package ConditionsAndLoops;

import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amount = in.nextDouble();

        System.out.println("Enter the number of years: ");
        int years = in.nextInt();

        System.out.println("Enter the Depreciation percentage: ");
        float dep_per = in.nextFloat();

        double dep_amount = amount;
        for (int i = 0; i < years; i++) {
            dep_amount = ((100 - dep_per) * dep_amount) / 100;
        }
        System.out.println("Depreciation Amount : " + dep_amount);

        in.close();
    }
}