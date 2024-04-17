public class Solution {
    public int scoreOfString(String s) {
        // Initialize a variable to keep track of the total score
        int sum = 0;
        
        // Loop through the string up to the second last character
        for (int i = 0; i < s.length() - 1; i++) {
            // Calculate the absolute difference between the ASCII values of current and next characters
            int diff = Math.abs((int)s.charAt(i) - (int)s.charAt(i + 1));
            
            // Add the absolute difference to the total score
            sum += diff;
        }
        
        // Return the total score
        return sum;
    }
}
