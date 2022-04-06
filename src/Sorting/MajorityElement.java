package Sorting;


public class MajorityElement {

    static int majority(int[] arr){
        int counter = 1;
        int major = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i] == major){
                counter++;
            }else{
                counter--;
                if (counter == 0){
                    major = arr[i];
                    counter = 1;
                }
            }
        }
        return major;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majority(arr));
    }
}
