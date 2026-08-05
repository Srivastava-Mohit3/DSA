package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindMissingElements {
    public static List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < low) {
                low = nums[i];
            }
            if (nums[i] > high) {
                high = nums[i];
            }
            list.add(nums[i]);
        }
        for (int i = low; i <= high; i++) {
            if (!list.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }

    public static List<Integer> findMissingElements1(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int num : nums) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }
        for (int i = low; i <= high; i++) {
            boolean found = false;
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1 };
        // for (int i : findMissingElements(arr)) {
        // System.out.print(i + " ");
        // }
        System.out.println(findMissingElements(arr));
        System.out.println(findMissingElements1(arr));
    }
}
