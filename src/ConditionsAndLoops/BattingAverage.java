package ConditionsAndLoops;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the total number of Runs Scored by the batsman till now : ");
        int runs = in.nextInt();

        System.out.println("Numbers of Inning played by the batsman: ");
        int bats_times = in.nextInt();

        float average = runs / bats_times;
        System.out.println("Average of this batsman : " + average + " Runs / Games");

        in.close();
    }
}
