package arrays;
public class RemoveElement {

    public static int solution(int arr[], int val) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return k;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2}, val = 2;
        System.out.println(solution(nums, val));
    }
}
