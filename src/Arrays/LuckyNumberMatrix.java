package Arrays;

import java.util.ArrayList;
import java.util.List;

/*
A lucky is number is define as the number which is smallest in row of m x m matrix
and that number is largest in the index of numder column.
e.g :
[10,4,2]
[3, 8,7]
[16,17,12]

here the number '12' is the lucky number, because it is smallest in his row and largest in same index of column;
 */
public class LuckyNumberMatrix {
    static List<Integer> findLuckyNumber(int[][] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            int minIndex = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                    minIndex = j;
                }
            }
            int max = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][minIndex] > max) {
                    max = arr[k][minIndex];
                }
            }
            if (min == max) {
                answer.add(max);
                break;
            }
        }
        return answer;
    }
        public static void main (String[] args){
            int[][] arr = {
                    {10, 4, 2},
                    {3, 8, 7},
                    {16, 17, 12}
            };
            System.out.println(findLuckyNumber(arr));
        }
    }