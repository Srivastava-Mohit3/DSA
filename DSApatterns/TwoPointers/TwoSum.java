package DSApatterns.TwoPointers;

import java.util.HashMap;

public class TwoSum {
    public static int[] solution(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        // int numbers[] = { 2, 7, 11, 15 }, target = 9;
        int numbers[] = { 3, 2, 4 }, target = 6;
        for (int i : solution(numbers, target)) {
            System.out.print(i + " ");
        }
    }
}
