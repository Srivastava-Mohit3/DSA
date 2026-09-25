package DSApatterns.TwoPointers;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int l = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[l] = nums1[i];
                i--;
                l--;
            } else {
                nums1[l] = nums2[j];
                j--;
                l--;
            }
        }
        while (i >= 0) {
            nums1[l] = nums1[i];
            i--;
            l--;
        }
        while (j >= 0) {
            nums1[l] = nums2[j];
            j--;
            l--;
        }
    }
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 }, m = 3, nums2[] = { 2, 5, 6 }, n = 3;
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
