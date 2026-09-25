package DailyProblems;

public class SmallestIndexWithDigitSumEqualIndex {
    public static int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == digitSum(nums[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            sum += temp;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2 };
        System.out.println(smallestIndex(nums));
    }
}
