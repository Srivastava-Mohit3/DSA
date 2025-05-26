public class FrequencyOfMostFrequentElement {
    public static int solution(int arr[], int k){
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= max) {
                arr[i]+=1;
            }
            if(arr[i] == max){ 
                count++;
            }
        }
        System.out.println(max);
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,4}, k = 5;

        System.out.println(solution(nums, k));
    }
}
