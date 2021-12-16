package ConditionsAndLoops;

import java.util.Scanner;

public class ProductDiscount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price of product (RS.) : ");
        float price = in.nextFloat();
        System.out.println("Enter the discount percentage: (%) : ");
        float percentage = in.nextFloat();

        float grossPrice = (price - (price * percentage) / 100);

        System.out.println("Final price of your product: RS. " + grossPrice);

        in.close();
    }
}
