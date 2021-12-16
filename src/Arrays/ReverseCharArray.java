package Arrays;

import java.util.Arrays;

public class ReverseCharArray {
    static void swap(char[] x, int i, int j) {
        char temp = x[i];
        x[i] = x[j];
        x[j] = temp;
    }

    public static void main(String[] args) {
        char[] x = {'h', 'e', 'l', 'l', 'o'};
        int j = x.length - 1;
        for (int i = 0; i < x.length / 2; i++) {
            swap(x, i, j);
            j--;
        }
        System.out.println(Arrays.toString(x));
    }
}
