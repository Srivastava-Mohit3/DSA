package testNOV25;

public class RotateArray {
    public static void subRotate(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length; // Handle k > nums.length
        subRotate(nums, nums.length - k, nums.length - 1);
        subRotate(nums, 0, nums.length - k - 1);
        subRotate(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 }, k = 3;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
