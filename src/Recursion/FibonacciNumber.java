package Recursion;

public class FibonacciNumber {

    static void fibo(int num){
        int n1 = 0;
        int n2 = 1;
        System.out.print(num+" ");
        fibo(n1+n2);
    }

    public static void main(String[] args) {

    }
}
