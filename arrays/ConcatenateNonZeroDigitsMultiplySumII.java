package arrays;

import java.util.LinkedHashMap;

public class ConcatenateNonZeroDigitsMultiplySumII {
    public static int[] sumAndMultiply(String s, int[][] queries) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        long MOD = 1_000_000_007L;
        int ans[] = new int[queries.length];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            map.put(i, digit);
        }
        System.out.println(map);
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            long num = 0;         
            int sum = 0;
            for (int j = start; j <= end; j++) {
                int temp = map.get(j);
                if (temp != 0) {
                    sum += temp;
                    num = (num * 10 + temp) % MOD;
                }
            }
            ans[idx++] = (int) ((num * sum) % MOD);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "10203004";
        int queries[][] = {{0,7},{1,3},{4,6}};
        for (int num : sumAndMultiply(s, queries)) {
            System.out.print(num + " ");
        }
    }
}
