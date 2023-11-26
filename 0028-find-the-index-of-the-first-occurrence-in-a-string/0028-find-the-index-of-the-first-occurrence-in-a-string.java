class Solution {
    // Function to find the index of the first occurrence of the needle in the haystack
    public int strStr(String haystack, String needle) {
        
        // Get the length of the haystack and needle
        int lengthOfHaystack = haystack.length();
        int lengthOfNeedle = needle.length();

        // Iterate through the haystack, checking substrings of length needle
        for (int steps = 0; steps < lengthOfHaystack - lengthOfNeedle + 1; steps++) {

            // Check if the current substring matches the needle
            if (haystack.substring(steps, steps + lengthOfNeedle).equals(needle)) {
                // If there is a match, return the starting index of the substring
                return steps;
            }
        }

        // If no match is found, return -1
        return -1;
    }
}
