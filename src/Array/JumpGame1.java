package Array;

public class JumpGame1 {
    static boolean canJump(int[] arr){
        int lastIndex = arr.length-1;
        for (int i=arr.length-1; i>=0; i--){
            if (i+arr[i] >= lastIndex)
                lastIndex = i;
        }
        return lastIndex == 0;
    }

    public static void main(String[] args) {

        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }
}
