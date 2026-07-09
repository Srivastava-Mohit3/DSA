package arrays;

import java.util.Stack;

public class ConcatenateNonZeroDigitsMultiplySumI {
    // public static long sumAndMultiply(int n) {
    //     Stack<Integer> st = new Stack<>();
    //     int sum = 0;
    //     while (n != 0) {
    //         int temp = n % 10;
    //         if (temp != 0) {
    //             sum += temp;
    //             st.push(temp);
    //         }
    //         n = n / 10;
    //     }
    //     int temp = 0;
    //     while (!st.isEmpty()) {
    //         temp = temp * 10 + st.pop();
    //     }
    //     return (long)temp * sum;
    // }

    public static long sumAndMultiply(int n) {
        int x = 0;
        int sum = 0;
        int i = 1;
        while (n > 0) {
            int m = n % 10;
            n /= 10;
            if (m == 0)
                continue;
            sum += m;
            x += (m * i);
            i *= 10;
        }
        return (long) x * sum;
    }
    public static void main(String[] args) {
        int n = 10203004;
        System.out.println(sumAndMultiply(n));
    }
}
