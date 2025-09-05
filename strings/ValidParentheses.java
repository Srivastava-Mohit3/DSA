// package strings;

import java.util.Stack;

public class ValidParentheses {
    public static boolean solution(String str) {
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty())
                    return false;
                if((ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{') || (ch == ']' && st.peek() == '[')) {
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
        System.out.println(st);
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(solution(str));
    }
}
