package Unthinkable.Two;

import java.util.ArrayList;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow1(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            result.add(max);
        }
        int ans[] = new int[result.size()];
        int i = 0;
        for (int element : result) {
            ans[i++] = element;
        }
        return ans;
    }

    public static int[] maxSlidingWindow2(int arr[], int k) {
        return new int[] { 1, 2 };
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 }, k = 3;
        for (int num : maxSlidingWindow1(arr, k)) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : maxSlidingWindow2(arr, k)) {
            System.out.print(num + " ");
        }
    }
}