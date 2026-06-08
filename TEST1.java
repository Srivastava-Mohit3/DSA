import java.util.Arrays;
import java.util.Collections;

public class TEST1 {
    public static void main(String[] args) {
        int arr[] = {10,4,8,3};
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i += 3) {
            sum += arr[i] + arr[i + 1];
        }
        System.out.println(sum);
    }
}