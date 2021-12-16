package ConditionsAndLoops;

import java.util.Scanner;

/*
scenario :-
1 to 100 units – Rs. 10/unit
100 to 200 units – Rs. 15/unit
200 to 300 units – Rs. 20/unit
above 300 units – Rs. 25/unit
*/
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double billAmount = 0;
        System.out.println("Enter the number of units used by customer: ");
        int units = in.nextInt();
        if (units <= 100) {
            billAmount = units * 10;
        } else if (units <= 200) {
            billAmount = (100 * 10) + (units - 100) * 15;
        } else if (units <= 300) {
            billAmount = (100 * 10) + (100 * 15) + (units - 200) * 20;
        } else if (units > 300) {
            billAmount = (100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25;
        }
        System.out.println("Your Electricity bill for this month : " + billAmount);
        in.close();
    }
}
