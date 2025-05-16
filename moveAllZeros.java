public class moveAllZeros {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 0, 1 };
        System.out.println("old Array- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if(arr[left] == 0) {
                left++;
            } else if(arr[right] == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("\nnew Array- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
