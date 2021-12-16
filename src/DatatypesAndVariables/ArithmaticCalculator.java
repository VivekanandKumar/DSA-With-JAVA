package DatatypesAndVariables;

import java.util.Scanner;

public class ArithmaticCalculator{
  public static void main(String[] args) {
    int num1,num2;
    double result;
    char operator;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two Number : ");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    System.out.print("Enter the operator ('+','-','*','/') : ");
    operator = sc.next().charAt(0);
    if(operator == '+'){
      result = num1 + num2;
      System.out.println("Addition : "+result);
    }else if(operator == '-'){
      result = num1 - num2;
      System.out.println("Subtraction : "+result);
    }else if(operator == '*'){
      result = num1 * num2;
      System.out.println("Multiplication : "+result);
    }else if(operator == '/'){
      result = (double)num1 / (double)num2;
      System.out.println("Division : "+result);
    }else{
      System.out.println("please Enter the CORRECT operator");
    }
    sc.close();
  }
}
