package arrays;

public class PartitionArrayAccordingGivenPivot {
    public static int[] solution(int arr[], int pivot) {
        int left = 0;
        int right = arr.length - 1;
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < pivot) {
                result[left++] = arr[i];
            }
            if (arr[i] > pivot) {
                result[right--] = arr[i];
            }
        }
        while (left <= right) {
            result[left++] = pivot;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = { 9, 12, 5, 10, 14, 3, 10 }, pivot = 10;
        for (int num : solution(nums, pivot)) {
            System.out.print(num + " ");
        }
    }
}
