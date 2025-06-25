package arrays;
import java.util.ArrayList;

public class FindUnion {
    public static ArrayList<Integer> solution(int nums1[], int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                if (arr.size() == 0 || arr.get(arr.size() - 1) != nums1[i]) {
                    arr.add(nums1[i]);
                }
                i++;
            } else {
                if (arr.size() == 0 || arr.get(arr.size() - 1) != nums2[j]) {
                    arr.add(nums2[j]);
                }
                j++;
            }
        }
        while (i < nums1.length) {
            arr.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            arr.add(nums2[j]);
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 4, 5 }, nums2[] = { 1, 2, 7 };
        ArrayList<Integer> arr = new ArrayList<>();
        arr = solution(nums1, nums2);
        System.out.println(arr);
    }
}


