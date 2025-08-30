package arrays;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int i : nums) {
            if(map.containsKey(i) && Math.abs(map.get(i) - idx) <= k) {
                return true;
            } else {
                map.put(i, idx);
            }
            idx++;
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 2, 3 }, k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
