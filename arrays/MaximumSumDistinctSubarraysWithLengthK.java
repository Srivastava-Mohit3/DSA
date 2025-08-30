package arrays;

public class MaximumSumDistinctSubarraysWithLengthK {
    public static long maximumSubarraySum(int[] nums, int k) {
        int maxSum = 0;
        int curSum = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (j - i == k) {
                Math.max(maxSum, curSum);
            } else {
                curSum += nums[i];
                j++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 5, 4, 2, 9, 9, 9 }, k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }
}
