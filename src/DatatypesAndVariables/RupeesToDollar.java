package DatatypesAndVariables;

import java.util.Scanner;

public class RupeesToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in Rupees Rs. : ");
        int rupees = sc.nextInt();
        float dollar = rupees / 74.36f;
        System.out.println("Your Money value in Dollar is : $" + dollar);
        sc.close();
    }
}
