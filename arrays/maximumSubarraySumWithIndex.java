package arrays;

public class maximumSubarraySumWithIndex {

    private static int[] maxSubArrayIndex(int[] arr) {
        int start = 0, end = 0, tempStart = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }
        return new int[] { start, end , maxSum};
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, 10, -5, 4 };
        for (int i : maxSubArrayIndex(arr)) {
            System.out.print(i + " ");
        }
    }

}
