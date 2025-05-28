import java.util.HashMap;

public class TwoSum {
    public static int [] solution(int arr[], int target) {
        int arrN[]  = new int[2];


        // brute-force

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if(arr[i] + arr[j] == target) {
        //             arrN[0] = i;
        //             arrN[1] = j;
        //             return arrN;
        //             // break;
        //         }
        //     }
        // }

        // this answer is perfect when the array is sorted
        
        // int left = 0;
        // int right = arr.length - 1;
        // while (left < right) {
        //     if(arr[left] + arr[right] == target) {
        //         arrN[0] = left;
        //         arrN[1] = right;
        //         // break;
        //         return arrN;
        //     } else {
        //         if(arr[left] + arr[right] < target) {
        //             left++;
        //         } else {
        //             right--;
        //         }
        //     }

        // }

        // best for all situation

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if(map.containsKey(temp)) {
                arrN[0] = map.get(temp);
                arrN[1] = i;
                return arrN;
                // break;
            } else {
                map.put(arr[i], i);
            }
        }

        return arrN;
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15}, target = 18;
        int arr[] = new int[2];
        arr = solution(nums, target);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
