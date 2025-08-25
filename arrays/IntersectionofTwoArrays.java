package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println("set elements:- " + set);
        int arr[] = new int[set.size()];
        int k = 0;
        for (int x : set) {
            arr[k++] = x;
        }

        return arr;
    }

    public static void main(String[] args) {
        int nums1[] = { 4, 9, 5 }, nums2[] = { 9, 4, 9, 8, 4 };
        for (int i : intersection(nums1, nums2)) {
            System.out.print(i + " ");
        }
    }
}
