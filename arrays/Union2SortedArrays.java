package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Union2SortedArrays {
    public static ArrayList<Integer> solution(int a[], int b[]) {
        int l1 = a.length;
        int l2 = b.length;
        int i = 0;
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (i < l1 && j < l2) {
            if (a[i] == b[j]) {
                set.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                set.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                set.add(b[j]);
                j++;
            }
        }
        while (i < l1) {
            set.add(a[i]);
            i++;
        }
        while (j < l2) {
            set.add(b[j]);
            j++;
        }
        for (int item : set) {
            list.add(item);
        }
        Collections.sort(list);
        // System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 }, b[] = { 1, 2, 3, 6, 7 };
        for (int i : solution(a, b)) {
            System.out.print(i + " ");
        }
    }
}
