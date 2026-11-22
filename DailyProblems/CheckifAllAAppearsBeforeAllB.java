package DailyProblems;

import java.util.Stack;

public class CheckifAllAAppearsBeforeAllB {
    public static boolean checkString(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == 'b' && ch == 'a') {
                return false;
            } else {
                st.push(ch);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(checkString(s));
    }
}
