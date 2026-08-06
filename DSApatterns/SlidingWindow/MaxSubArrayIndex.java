package DSApatterns.SlidingWindow;

public class MaxSubArrayIndex {
    public static int[] solution(int arr[]) {
        // int currSum = 0;
        // int maxSum = Integer.MIN_VALUE;
        // int stIdx = 0;
        // int endIdx = 0;
        // for (int i = 0; i < arr.length; i++) {
        // currSum += arr[i];
        // if (currSum < 0) {
        // currSum = 0;
        // stIdx = i;
        // }
        // if (currSum > maxSum) {
        // maxSum = currSum;
        // endIdx = i;
        // }
        // }
        // return new int[] { stIdx, endIdx };

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }
        return new int[] { start, end };
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        for (int i : solution(arr)) {
            System.out.print(i + " ");
        }
    }
}
