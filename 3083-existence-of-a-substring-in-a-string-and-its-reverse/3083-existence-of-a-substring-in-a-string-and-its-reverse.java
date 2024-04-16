public class Solution {
    public boolean isSubstringPresent(String s) {
        // Reverse the input string
        StringBuilder sb = new StringBuilder(s);
        String sReverse = sb.reverse().toString();
        
        // Iterate over each index of the string up to the second-to-last index
        for (int i = 0; i < s.length() - 1; i++) {
            // Extract a substring of length 2 starting from the current index i
            String temp = s.substring(i, i + 2);
            
            // Check if the substring exists in the reversed string
            if (sReverse.contains(temp)) {
                return true;  // If found, return true
            }
        }
        
        return false;  // If no such substring is found, return false
    }
}
