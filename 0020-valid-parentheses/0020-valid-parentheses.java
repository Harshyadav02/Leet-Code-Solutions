
class Solution {
    public boolean isValid(String s) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();
        // Initialize a flag to indicate the validity of the string
        boolean validString = true;

        // Iterate through each character in the input string
        for (int index = 0; index < s.length(); index++) {
            char currentChar = s.charAt(index);

            // If the current character is an opening bracket, push it onto the stack
            if (currentChar == '{' || currentChar == '(' || currentChar == '[') {
                stack.push(currentChar);
            } else {
                // If the current character is a closing bracket
                // Check if the stack is empty (no corresponding opening bracket)
                if (stack.isEmpty()) {
                    validString = false;
                    break;
                }

                // Pop the top element from the stack (corresponding opening bracket)
                char topElement = stack.pop();

                // Check if the current closing bracket matches the popped opening bracket
                if ((topElement == '(' && currentChar != ')') ||
                    (topElement == '{' && currentChar != '}') ||
                    (topElement == '[' && currentChar != ']')) {
                    // If there is a mismatch, set the validity flag to false and exit the loop
                    validString = false;
                    break;
                }
            }
        }

        // Check if there are remaining opening brackets in the stack
        if (!stack.isEmpty()) {
            // If there are, the string is invalid
            validString = false;
        }

        // Return the final validity of the string
        return validString;
    }
}
