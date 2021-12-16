package Functions;

import java.util.Scanner;

public class StudentsGrade {

    public static String studentGrade(int marks) {
        String grade = "";

        if (marks <= 40) {
            grade = "FAIL";
        } else if (marks > 90 && marks <= 100) {
            grade = "AA";
        } else if (marks > 80 && marks <= 90) {
            grade = "AB";
        } else if (marks > 70 && marks <= 80) {
            grade = "BB";
        } else if (marks > 60 && marks <= 70) {
            grade = "BC";
        } else if (marks > 50 && marks <= 60) {
            grade = "CD";
        } else if (marks > 40 && marks <= 50) {
            grade = "DD";
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total marks of student (out of 100): ");
        int mark = in.nextInt();
        if (mark > 100) {
            System.out.println("Enter a valid mark");
        } else {
            System.out.println("Grade of Student: " + studentGrade(mark));
        }
        in.close();
    }
}
