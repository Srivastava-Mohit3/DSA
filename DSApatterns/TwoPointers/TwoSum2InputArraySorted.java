package DSApatterns.TwoPointers;

public class TwoSum2InputArraySorted {
    public static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 7, 11, 15 }, target = 9;
        for (int i : twoSum(numbers, target)) {
            System.out.print(i + " ");
        }
    }
}
