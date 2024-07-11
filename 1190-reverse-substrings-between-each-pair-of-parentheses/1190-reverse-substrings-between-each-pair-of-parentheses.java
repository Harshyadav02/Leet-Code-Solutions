import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        stack.push(new StringBuilder());  // Initial empty string builder

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(new StringBuilder());  // Push a new string builder for the new context
            } else if (ch == ')') {
                StringBuilder reversed = stack.pop().reverse();
                stack.peek().append(reversed);  // Append the reversed content to the previous context
            } else {
                stack.peek().append(ch);  // Append the character to the current context
            }
        }

        return stack.pop().toString();  // Return the final result
    }
}
