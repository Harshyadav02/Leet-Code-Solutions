
class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> operators = new Stack<>();
        Stack<Stack<Boolean>> values = new Stack<>(); 
        
        values.push(new Stack<>()); 

        for (char c : expression.toCharArray()) {
            if (c == 't') {
                values.peek().push(true);
            } else if (c == 'f') {
                values.peek().push(false);
            } else if (c == '&' || c == '|' || c == '!') {
                operators.push(c);
                values.push(new Stack<>()); 
            } else if (c == ')') {
                char op = operators.pop();
                Stack<Boolean> group = values.pop();
                
                boolean result = doOperations(op, group);
                values.peek().push(result); 
            }
        }
        
        return values.pop().pop(); 
    }

    private boolean doOperations(char op, Stack<Boolean> group) {
        boolean result;
        
        if (op == '&') {
            result = true;
            for (boolean val : group) {
                result &= val;
            }
        } else if (op == '|') {
            result = false;
            for (boolean val : group) {
                result |= val;
            }
        } else { 
            result = !group.pop();
        }
        
        return result;
    }
}
