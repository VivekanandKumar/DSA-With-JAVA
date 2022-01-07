package Array;

import java.util.Scanner;

public class Stack {

    int[] stack;
    int top = -1;
    int item;
    int s;

    Stack(int size) {
        s = size;
        stack = new int[size];
    }

    void push(Scanner sc) {
        if (top == s - 1) {
            System.out.println("Stack Full");
        } else {
            top++;
            System.out.println("Enter a value : ");
            item = sc.nextInt();
            stack[top] = item;
            System.out.println("Item Pushed");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty.....");
        } else {
            System.out.println(stack[top] + " Popped");
            stack[top] = 0;
            top--;
        }
    }

    void peak() {
        if (top == -1) {
            System.out.println("Stack is Empty.....");
        } else {
            System.out.println("Peak Element : " + stack[top]);
        }
    }

    void show() {
        if (top == -1) {
            System.out.println("Nothing to Show :)");
        } else {
            System.out.println("Stack elements are : ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Stack: ");
        int size = sc.nextInt();
        Stack st = new Stack(size);
        int ch;
        System.out.println("***** Main Menu *****\n1. PUSH\n2. POP\n3. PEAK\n4. SHOW\n5. EXIT");
        do {
            System.out.println("Enter Your Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    st.push(sc);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peak();
                    break;
                case 4:
                    st.show();
                    break;
                case 5:
                    System.out.println("Good Bye ....");
                    break;
                default:
                    System.out.println("Wrong Choice !!:)");
            }
        } while (ch!=5);
    }
}