package newSeries;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortArrayIncreasingFrequency {
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer i : map.keySet()) {
            maxHeap.add(map.get(i));
        }
        System.out.println(maxHeap);
        return new int[] { 1, 2, 3 };
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 2, 3 };
        // Output: [3,1,1,2,2,2]
        for (int i : frequencySort(nums)) {
            System.out.print(i + " ");
        }
    }
}
