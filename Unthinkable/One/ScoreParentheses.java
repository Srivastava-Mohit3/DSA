package Unthinkable.One;

import java.util.Stack;

public class ScoreParentheses {
    public static int scoreOfParentheses1(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(ch);
            } else {
                if (!st.isEmpty() || st.peek() == '(') {
                    count++;
                    st.pop();
                }
            }
        }
        return count;
    }
    
    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // base score

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(0);
            } else {
                int v = stack.pop();
                int score = Math.max(2 * v, 1);
                stack.push(stack.pop() + score);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String str = "(())";
        // String str = "()";
        // String str = "()()";
        // String str = "(()(()))";  // 6 
        System.out.println(scoreOfParentheses(str));
    }
}
