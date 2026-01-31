public class FindPeakElement {
    public static int findPeakElement(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            System.out.println("Left: " + left + " Right: " + right + " Mid: " + mid);
            if(arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 7, 3, 8};
        System.out.println(findPeakElement(arr));
    }
}
