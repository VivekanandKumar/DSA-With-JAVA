package Arrays;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumCandies {

    static List<Boolean> kids(int[] candies, int extra) {
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] >= max) {
                max = candies[i];
            }
        }
        for (int item : candies) {
            list.add(item + extra >= max);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 10, 1, 6, 4, 11 };
        System.out.println(kids(arr, arr.length/2));
    }
}