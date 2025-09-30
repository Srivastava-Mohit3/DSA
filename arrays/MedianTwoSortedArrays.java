package arrays;

import java.util.ArrayList;

public class MedianTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        int i = 0, j = 0;
        double res = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < nums1Len && j < nums2Len) {
            if (nums1[i] < nums2[j]) {
                list.add(nums1[i]);
                i++;
            } else {
                if (nums1[i] > nums2[j]) {
                    list.add(nums2[j]);
                    j++;
                }
            }
        }
        while (i < nums1Len) {
            list.add(nums1[i]);
            i++;
        }
        while (j < nums2Len) {
            list.add(nums2[j]);
            j++;
        }
        if (list.size() % 2 == 1) {
            res = list.get(list.size() / 2);
        } else {
            int mid = list.size() / 2;
            res = (list.get(mid) + list.get(mid - 1)) / 2.0;
        }
        System.out.println(list);
        return res;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2 }, nums2[] = { 3, 4 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
