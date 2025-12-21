package testNOV25;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // int nums[] = {1,1,1,3,3,4,3,2,4,2};
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(containsDuplicate(nums));
    }
}
