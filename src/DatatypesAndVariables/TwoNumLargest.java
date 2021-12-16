package DatatypesAndVariables;

import java.util.Scanner;

public class TwoNumLargest{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 ,num2;
    System.out.print("Enter two Numbers : ");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    if(num1 > num2){
      System.out.println(num1+" is Largest");
    }else{
      System.out.println(num2+" is Largest");
    }
    sc.close();
  }
}
