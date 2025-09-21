package newSeries;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums) {
            // if(!maxHeap.contains(i)) {
            //     maxHeap.add(i);
            // }
            maxHeap.add(i);
        }
        // System.out.println(maxHeap);
        for (int i = 1; i < k; i++) {
            maxHeap.poll();
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 6, 4 }, k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}
