package arrays;

// If k>0,replace the ith number with the sum of the next k numbers.If k<0,replace the ith number with the sum of the previous k numbers.If k==0,replace the ith number with 0.

public class DefusetheBomb {
    public static int[] decrypt(int[] code, int k) {
        int arr[] = new int[code.length];
        if (k == 0) {
            return arr;
        }
        if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % code.length];
                }
                arr[i] = sum;
            }
        } else {
            int kk = -k; 
            for (int i = 0; i < code.length; i++) {
                int sum = 0; 
                for (int t = 1; t <= kk; t++) {
                    int idx = i - t;
                    idx = ((idx % code.length) + code.length) % code.length;
                    sum += code[idx];
                }
                arr[i] = sum;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // int code[] = { 5, 7, 1, 4 }, k = 3;
        int code[] = {2,4,9,3}, k = -2;

        for (int i : decrypt(code, k)) {
            System.out.println(i + " ");
        }
    }
}
