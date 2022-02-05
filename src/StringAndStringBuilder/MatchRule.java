package StringAndStringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/count-items-matching-a-rule/
public class MatchRule {
    static int matchRule(List<List<String>> list, String ruleKey, String ruleValue) {
        int count = 0;
        int choice = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };
        for (List<String> item : list) {
            if (item.get(choice).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String ruleKey ="name";
        String ruleValue = "lenovo";
        List<List<String>> list = new ArrayList<>();
        List<String> l1 = Arrays.asList("phone", "blue", "pixel");
        List<String> l2 = Arrays.asList("computer", "silver", "lenovo");
        List<String> l3 = Arrays.asList("phone", "gold", "iphone");
        list.add(l1);
        list.add(l2);
        list.add(l3);

        System.out.println(matchRule(list,ruleKey,ruleValue));

    }

}
