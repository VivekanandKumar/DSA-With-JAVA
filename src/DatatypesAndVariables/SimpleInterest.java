package DatatypesAndVariables;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle value in Rs. : ");
        int principle = sc.nextInt();
        System.out.print("Enter the Time in Years: ");
        int time = sc.nextInt();
        System.out.print("Rate of Interest in percentage: ");
        int rate = sc.nextInt();
        System.out.println("Principle : RS." + principle);
        System.out.println("Time : " + time + " Years");
        System.out.println("Rate : " + rate + " %");
        int simple_interest = (principle * rate * time) / 100;
        System.out.println("Simple Interest : Rs." + simple_interest);
        sc.close();
    }
}
