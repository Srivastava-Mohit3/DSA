package Unthinkable.One;

import java.util.Stack;

public class MinimumNumberSwapsMakeStringBalanced {
    public static int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || stack.peek() == ']') {
                    stack.push(ch);
                } else {
                    stack.pop();
                }
            }
        }
        int totalBrackets = stack.size();
        int closedBrackets = (totalBrackets / 2);
        return (closedBrackets + 1) / 2;
    }

    public static void main(String[] args) {
        String str = "]]][[[";
        System.out.println(minSwaps(str));
    }
}
