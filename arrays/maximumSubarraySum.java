package arrays;

public class maximumSubarraySum {
    public static int maxSubArray(int[] nums) {
        // int maxSum = Integer.MIN_VALUE;
        // int currSum = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     currSum = Math.max(nums[i], currSum + nums[i]);
        //     maxSum = Math.max(maxSum, currSum);
        // }
        // return maxSum;

        int max_sum = Integer.MIN_VALUE;
        int cur_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            cur_sum = cur_sum + nums[i];
            if (cur_sum > max_sum) {
                max_sum = cur_sum;
            }
            if (cur_sum < 0) {
                cur_sum = 0;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(arr));
    }
}
