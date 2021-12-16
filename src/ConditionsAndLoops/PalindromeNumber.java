package ConditionsAndLoops;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter an Integer number : ");
        int number = in.nextInt();
        int temp = number;
        int res = 0;
        while(number > 0){
            int rem = number%10;
            number = number/10;
            res = res*10+rem;
        }
        if(temp == res){
            System.out.println("Given number is a Palindrome Number");
        }else{
            System.out.println("Given number is not a Palindrome Number");
        }


        in.close();
    }
}
