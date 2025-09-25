package arrays;

public class MinimumSizeSubarraySum {

    // public static int minSubArrayLen(int target, int[] nums) {
    // int minLen = Integer.MAX_VALUE;
    // for (int i = 0; i < nums.length; i++) {
    // int sum = 0;
    // for (int j = i; j < nums.length; j++) {
    // sum += nums[j];
    // if (sum >= target) {
    // minLen = Math.min(minLen, j - i + 1);
    // break;
    // }
    // }
    // }
    // return minLen == Integer.MAX_VALUE ? 0 : minLen;
    // }

    public static int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int right = 0, left = 0;
        int sum  = 0;
        while (right < nums.length) {
            // int sum = 0;
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return minLen;
    }

    public static void main(String[] args) {
        int target = 7, nums[] = { 2, 3, 1, 2, 4, 3 };
        System.out.println(minSubArrayLen(target, nums));
    }

}
