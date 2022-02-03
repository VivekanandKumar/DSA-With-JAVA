package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemMatchesRule {

    static int matchRule(List<List<String>> list, String ruleKey, String ruleValue) {
        int count = 0;
        int choice = -1;
        switch (ruleKey) {
            case "type":
                choice = 0;
                break;
            case "color":
                choice = 1;
                break;
            case "name":
                choice = 2;
                break;
        }
        for (List<String> item : list) {
            if (item.get(choice).equals(ruleValue)) {
                System.out.println(item);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> l1 = Arrays.asList("phone", "blue", "pixel");
        List<String> l2 = Arrays.asList("computer", "silver", "lenovo");
        List<String> l3 = Arrays.asList("phone", "gold", "iphone");
        list.add(l1);
        list.add(l2);
        list.add(l3);

        String ruleKey = "type";
        String ruleValue = "phone";
//        ItemMatchesRule it = new ItemMatchesRule();

        System.out.println(matchRule(list, ruleKey, ruleValue));

    }
}
