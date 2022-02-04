package StringAndStringBuilder;

//https://leetcode.com/problems/robot-return-to-origin/
public class RobotMoves {

    static boolean isOrigin(String moves) {
        int vertical = 0;
        int horizontal = 0;

        for (int x = 0; x < moves.length(); x++) {
            switch (moves.charAt(x)) {
                case 'U' -> vertical++;
                case 'D' -> vertical--;
                case 'L' -> horizontal--;
                case 'R' -> horizontal++;
            }
        }
        return (vertical == 0 && horizontal == 0);
    }

    public static void main(String[] args) {
        String moves = "LL";
        System.out.println(isOrigin(moves));
    }
}
