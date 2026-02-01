package Unthinkable.One;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if(st.isEmpty()) {
                    return false;
                } 
                if(ch == ')' && st.peek() == '(' || ch == '}' && st.peek() == '{' || ch == ']' && st.peek() == '[') {
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        // String s = "()[]{}";
        String s = "(]";
        System.out.println(isValid(s));
    }
}
