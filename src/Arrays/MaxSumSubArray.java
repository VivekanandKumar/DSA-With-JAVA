package Arrays;

public class MaxSumSubArray {

    static int maxSubArraySum(int[] arr){
        int sum =arr[0];
        int maxSum =arr[0];
        for(int i=1;i<arr.length;i++){
            sum += arr[i];
            if (sum > maxSum)
                maxSum =sum;
            if (sum < 0)
                sum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr ={-2,7,2,-1,6,-10};
        System.out.println(maxSubArraySum(arr));
    }
}
