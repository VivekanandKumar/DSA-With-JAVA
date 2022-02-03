package DatatypesAndVariables;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int Number = sc.nextInt();
        if (Number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
        sc.close();
    }
}
