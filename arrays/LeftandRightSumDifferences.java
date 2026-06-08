package arrays;

public class LeftandRightSumDifferences {
    public static int[] solution(int arr[]) {
        int leftSum[] = new int[arr.length];
        int rightSum[] = new int[arr.length];
        for (int l = 1; l <= arr.length - 1; l++) {
            leftSum[l] = leftSum[l - 1] + arr[l - 1];
        }
        System.out.print("left - ");
        for (int i = 0; i < leftSum.length; i++) {
            System.out.print(leftSum[i] + ", ");
        }
        System.out.print("\nright - ");
        for (int r = arr.length - 1 - 1; r >= 0; r--) {
            rightSum[r] = rightSum[r + 1] + arr[r + 1];
        }
        for (int i = 0; i < rightSum.length; i++) {
            System.out.print(rightSum[i] + ", ");
        }
        int ans[] = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 4, 8, 3 };
        for (int num : solution(arr)) {
            System.out.print(num + ", ");
        }
    }
}
