class Solution {
    public boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Get the reversed string
        String reversed = reverseString(cleanedString);

        // Check if the cleaned and reversed strings are equal
        return cleanedString.equals(reversed);
    }

    private String reverseString(String string) {
        StringBuilder reversed = new StringBuilder();

        for (int ch = string.length() - 1; ch >= 0; ch--) {
            reversed.append(string.charAt(ch));
        }

        return reversed.toString();
    }
}
