package arrays;

public class FindGreatestCommonDivisorArray {

    public static int findMIN(int nums[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }

    public static int findMAX(int nums[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int findGCD(int[] nums) {
        int min = findMIN(nums);
        int max = findMAX(nums);
        System.out.println(min + " " + max);
        while (max != 0) {
            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
    }

        // public static int findGCD(int[] nums) {
        //     int max = Integer.MIN_VALUE;
        //     int min = Integer.MAX_VALUE;
        //     for (int num : nums) {
        //         if (num > max) {
        //             max = Math.max(max, num);
        //         }
        //         if (num < min) {
        //             min = Math.min(min, num);
        //         }

        //     }
        //     return Gcd(max, min);

        // }

        // public static int Gcd(int max, int min) {
        //     if (min == 0) {
        //         return max;
        //     }
        //     return Gcd(min, max % min);
        // }
    public static void main(String[] args) {
        int nums[] = { 2, 5, 6, 9, 10 };
        System.out.println(findGCD(nums));
    }
}
