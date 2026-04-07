package BinarySearch;

public class CeilingOfNumber {
    public static int solution(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid: " + mid);
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if(left == arr.length || arr[left] < target) {
            return -1;
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 10, 12, 19 }, target = 52; // at index: 2 => value: 8
        System.out.println(solution(arr, target));
    }
}
