package newSeries;

import java.util.PriorityQueue;

public class KthSmallest {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : arr) {
            minHeap.add(i);
        }
        System.out.println(minHeap);
        for (int i = 1; i < k; i++) {
            minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 3, 20, 15 }, k = 3;
        System.out.println(kthSmallest(arr, k));
    }
}
