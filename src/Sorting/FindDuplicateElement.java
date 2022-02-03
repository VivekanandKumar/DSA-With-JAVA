package Sorting;
//https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicateElement {
    static int findDuplicate(int[] arr) {
        int i=0;
        while (i< arr.length){
            if (arr[i] != arr[arr[i]-1])
                swap(arr,i,arr[i]-1);
            else
                i++;
        }

        for (int x = 0; x < arr.length; x++){
            if (arr[x] != x+1){
                return arr[x];
            }
        }
        return -1;
    }
    static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(findDuplicate(arr));
    }
}
