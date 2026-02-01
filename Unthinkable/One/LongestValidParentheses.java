package Unthinkable.One;

import java.util.Stack;

public class LongestValidParentheses {
    public static int approach(String s) {
        int maxLen = 0;
        int left = 0, right = 0;
        // Left to right scan
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLen = Math.max(maxLen, 2 * right);
            } else if (right > left) {
                left = right = 0;
            }
        }
        return maxLen;
    }

    public static int longestValidParentheses(String str) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - st.peek() );
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = ")()())";
        System.out.println(longestValidParentheses(str));
    }
}
