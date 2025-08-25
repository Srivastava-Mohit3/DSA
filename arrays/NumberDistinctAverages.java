package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class NumberDistinctAverages {
    public int distinctAverages(int[] nums) {
        HashSet<Float> set = new HashSet<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            float avg = (nums[left] + nums[right]) / 2.0f;
            set.add(avg);
            left++;
            right--;
        }
        return set.size();
    }

    public static void main(String[] args) {
        int nums[] = { 4, 1, 4, 0, 3, 5 };
        NumberDistinctAverages obj = new NumberDistinctAverages();
        System.out.println(obj.distinctAverages(nums));
    }
}
