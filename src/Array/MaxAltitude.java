package Array;

public class MaxAltitude {

    static int maxAltitude(int[] arr){
        int max_alt = 0;
        int curr_alt = 0;
        for (int j : arr) {
            curr_alt += j;
            if (curr_alt > max_alt) {
                max_alt = curr_alt;
            }
        }
        return max_alt;
    }

    public static void main(String[] args) {
        int[] arr ={-5,1,5,0,-7};
        System.out.println(maxAltitude(arr));
    }
}
