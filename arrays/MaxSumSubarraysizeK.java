package arrays;

public class MaxSumSubarraysizeK {
    public static int[] maxSubarraySum(int arr[], int k) {
        int currSum = 0;
        int maxSum = 0;
        int i = 0, j = 0;
        while (j < arr.length) {
            currSum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, currSum);
                currSum -= arr[i];
                i++;
                j++;
            }
        }
        return new int[]{maxSum, i, j};
    }

    public static void main(String[] args) {
        int arr[] = { 100, 200, 300, 400 }, k = 2;
        for (int i : maxSubarraySum(arr, k)) {
            System.out.print(i + " ");
        }
    }
}
