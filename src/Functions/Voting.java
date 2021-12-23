package Functions;

public class Voting {

    static void canVote(int age) {
        if (age <= 0) {
            System.out.println("Please enter a valid age");
        } else if (age >= 18) {
            System.out.println("Welcome to Voting.  :)");
        } else {
            System.out.println("You're not eligible to vote !!");
        }
    }

    public static void main(String[] args) {
        int age = 4;
        canVote(age);
    }
}
