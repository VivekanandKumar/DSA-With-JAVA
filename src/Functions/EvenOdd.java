package Functions;

import java.util.Scanner;

public class EvenOdd {

    static boolean isEven(int num) {
        return num%2 == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer number: ");
        int num = in.nextInt();
        if (isEven(num)) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is odd");
        }
        in.close();
    }
}
