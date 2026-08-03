package DSApatterns.TwoPointers;

public class MoveOnesToEnd {
    // public static void solution(int arr[]) {
    // int left = 0;
    // int right = arr.length - 1;
    // while (left < right) {
    // if (arr[left] == 0 && arr[right] == 1) {
    // left++;
    // right--;
    // } else if (arr[left] == 0) {
    // left++;
    // } else if (arr[right] == 1) {
    // right--;
    // } else {
    // int temp = arr[left];
    // arr[left] = arr[right];
    // arr[right] = temp;
    // left++;
    // right--;
    // }
    // }
    // }

    public static void solution(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 }; // [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
        solution(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
