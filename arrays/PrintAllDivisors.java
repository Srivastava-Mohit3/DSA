package arrays;
import java.util.ArrayList;

public class PrintAllDivisors {
    public static int[] solution(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if(num % i ==0) {
                list.add(i);
            }
        }
        int n= list.size();
        int arr[]= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;

        // int arr[] = new int[num];
        // int j = 0;
        // for (int i = 1; i <= num; i++) {
        //     if(num % i == 0) {
        //         arr[j] = i;
        //         j++;
        //     }
        // }
        // return arr;
    }
    public static void main(String[] args) {
        int num = 6;
        int arr[] = solution(num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
