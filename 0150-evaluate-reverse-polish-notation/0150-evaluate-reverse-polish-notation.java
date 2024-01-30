
class Solution {
    public int evalRPN(String[] tokens) {
        // Create a stack to store integers during the evaluation
        Deque<Integer> stk = new ArrayDeque<>();
        
        // Iterate through each token in the input array
        for (String t : tokens) {
            // Check if the token is a number (either a single digit or more)
            if (t.length() > 1 || Character.isDigit(t.charAt(0))) {
                // Convert the string to an integer and push it onto the stack
                stk.push(Integer.parseInt(t));
            } else {
                // If the token is an operator (+, -, *, /)
                int y = stk.pop(); // Pop the top element (second operand)
                int x = stk.pop(); // Pop the next element (first operand)

                // Perform the corresponding operation based on the operator
                switch (t) {
                    case "+":
                        stk.push(x + y);
                        break;
                    case "-":
                        stk.push(x - y);
                        break;
                    case "*":
                        stk.push(x * y);
                        break;
                    default:
                        stk.push(x / y);
                        break;
                }
            }
        }
        // The final result will be the only element left on the stack
        return stk.pop();
    }
}
