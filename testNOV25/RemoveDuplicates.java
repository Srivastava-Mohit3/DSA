package testNOV25;

class RemoveDuplicates {
    public static int solution(int arr[]) {
        int i = 0;
        int j  = 1;
        // for (int j = 1; j < arr.length; j++) {
        //     if (arr[i] != arr[j]) {
        //         i++;
        //         arr[i] = arr[j];
        //     }
        // }
        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
            
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(solution(arr));
    }
}