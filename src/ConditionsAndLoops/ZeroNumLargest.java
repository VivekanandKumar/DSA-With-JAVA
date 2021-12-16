package ConditionsAndLoops;

import java.util.Scanner;

public class ZeroNumLargest{
  public static void main(String[] args) {
    int max = 0;
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter whole numbers : ");
    num = sc.nextInt();
    while(num!=0){
      if(num > max){
        max = num;
      }
      num = sc.nextInt();
    }
    System.out.println("Largest Number among all entered values is : "+max);
    sc.close();
  }
}
