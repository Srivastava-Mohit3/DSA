package testYou;

import java.util.ArrayList;
import java.util.HashSet;
public class Remove {
    public static int[] solution(int arr[]) {
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if(arr[i] != arr[count]) {
        // count++;
        // arr[i] = arr[count];
        // }
        // }
        // return count;


        // ArrayList<Integer> list = new ArrayList<>();
        // int j = 0;
        // for (int i = 1; i < arr.length; i++) {
        //     if(arr[i] != arr[j]) {
        //         list.add(arr[j]);
        //         j++;
        //     }
        // }
        // System.out.println(list);


        // return new int[] { 1, 2 };

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[j]) {
                arr[++j] = arr[i];
            }
        }
        int newArr[] = new int[j + 1];
        for (int k = 0; k <= j; k++) {  
            newArr[k] = arr[k];
        }
        return newArr;

        // HashSet<Integer> set = new HashSet<>();
        // for (int i : arr) { 
        //     set.add(i);
        // }   
        // return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 4, 4, 5, 5, 6 };
        for (int i : solution(arr)) {

            System.out.print(i + " ");
        }
    }
}
