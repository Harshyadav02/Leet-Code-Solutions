class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        // Initialize two empty strings to build the processed versions of s and t.
        String helper_1 = "";
        String helper_2 = "";
        
        // Process string s to account for backspaces (#).
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '#') {
                // Append non-backspace characters to helper_1.
                helper_1 += ch;
            } else if (ch == '#' && helper_1.length() > 0) {
                // Remove the last character when a backspace is encountered.
                helper_1 = helper_1.substring(0, helper_1.length() - 1);
            }
        }
               
        // Process string t in a similar manner.
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch != '#') {
                // Append non-backspace characters to helper_2.
                helper_2 += ch;
            } else if (ch == '#' && helper_2.length() > 0) {
                // Remove the last character when a backspace is encountered.
                helper_2 = helper_2.substring(0, helper_2.length() - 1);
            }
        }
        
        // Compare the processed strings and return the result.
        if (helper_1.equals(helper_2)) {
            return true;
        }
        
        return false;
    }
}
