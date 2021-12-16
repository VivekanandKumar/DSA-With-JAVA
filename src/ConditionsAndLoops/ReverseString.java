package ConditionsAndLoops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String reverse = "";
        System.out.println("Enter a string : ");
        String str = in.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
        in.close();

    }
}
