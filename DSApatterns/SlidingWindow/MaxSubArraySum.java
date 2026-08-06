package DSApatterns.SlidingWindow;

public class MaxSubArraySum {
    public static int solution(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    // when all elements are negative then just update the maxSum value before updating currSum value to 0
    public static int solution1(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = { -8, -3, -6, -2, -5, -4 };
        // int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(solution1(arr));
        System.out.println(solution(arr));
    }
}
