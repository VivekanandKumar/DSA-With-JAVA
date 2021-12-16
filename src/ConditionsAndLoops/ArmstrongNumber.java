package ConditionsAndLoops;

import java.util.Scanner;

public class ArmstrongNumber {

    static int power(int num) {
        int pow = 0;
        while (num > 0) {
            num = num / 10;
            pow++;
        }
        return pow;
    }

    static boolean isArmstrong(int num) {
        boolean flag = false;
        int temp = num;
        int result = 0;
        int raise = power(num);
        while (num > 0) {
            int rem = num % 10;
            result = result + (int) Math.pow(rem, raise);
            num = num / 10;
        }
        if (result == temp) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer Value: ");
        int number = in.nextInt();

        if (isArmstrong(number)) {
            System.out.println("Given Number is an Armstrong Number");
        } else {
            System.out.println("Given Number is Not an Armstrong Number");
        }
        in.close();
    }
}