package arrays;

class SearchIn2DArray{
    public static void solution(int arr[][], int target) {
        int r = arr.length;
        int c = arr[0].length - 1;
        int i = 0;
        while(i < r && c >= 0){
            if(arr[i][c] == target){
                System.out.println("Found target element at:- " + i + " " + c);
                return;
            }
            if(arr[i][c] < target) {
                i++;
            } else {
                c--;
            }
        }
        System.out.println("Target not found");
    }
    public static void main(String args[]) {
        int arr [][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20}
        };
        solution(arr, 15);
    }
}
