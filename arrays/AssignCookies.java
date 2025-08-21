package arrays;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length;
        int n = s.length;
        int count = 0;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (s[j] >= g[i]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            } 
        }
        return count;
    }

    public static void main(String[] args) {
        int g[] = { 1, 2, 3 }, s[] = { 1, 1 };
        System.out.println(findContentChildren(g, s));
    }
}
