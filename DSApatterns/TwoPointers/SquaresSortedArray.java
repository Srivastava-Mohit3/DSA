package DSApatterns.TwoPointers;

public class SquaresSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int idx = nums.length - 1;
        while (left <= right) {
            int leftSQ = nums[left] * nums[left];
            int rightSQ = nums[right] * nums[right];
            if (leftSQ > rightSQ) {
                res[idx] = leftSQ;
                left++;
            } else {
                res[idx] = rightSQ;
                right--;
            }
            idx--;
        }
        return res;
    }

    public static void main(String[] args) {
        // int arr[] = { -4, -1, 0, 3, 10 }; // [0,1,9,16,100]
        int arr[] = { -7, -3, 2, 3, 11 }; // [4,9,9,49,121]
        for (int i : sortedSquares(arr)) {
            System.out.print(i + " ");
        }
    }
}
