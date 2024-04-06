class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] characters = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '(') {
                stack.push(i);
            } else if (characters[i] == ')' && stack.isEmpty()) {
                characters[i] = ' ';
            } else if (characters[i] == ')') {
                stack.pop();
            }
        }
        
        while (!stack.isEmpty()) {
            characters[stack.pop()] = ' ';
        }
        
        return new String(characters).replaceAll("\\s+", "");
    }
}
