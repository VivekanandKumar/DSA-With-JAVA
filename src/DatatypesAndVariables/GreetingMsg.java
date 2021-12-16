package DatatypesAndVariables;

import java.util.Scanner;

public class GreetingMsg{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Name : ");
    String name = sc.next();
    System.out.println("Hello "+name+" ! Have a Nice day :)");
    sc.close();
  }
}
