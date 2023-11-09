class Solution {
    public int maxPower(String s) {
        // Variable to store the maximum consecutive character count
        int max_count = Integer.MIN_VALUE;
        // Variable to store the current consecutive character count
        int count = 1;
        // Pointers to track the current position in the string
        int i = 0;
        int j = i + 1;

        // Check if the length of the string is greater than 1
        if (s.length() > 1) {
            // Iterate through the string
            while (i < j && j < s.length()) {
                // Check if consecutive characters are different
                if (s.charAt(i) != s.charAt(j)) {
                    // Update pointers and check if the current count is greater than max_count
                    i = j;
                    j = i + 1;
                    max_count = Math.max(max_count, count);
                    // Reset count for the new consecutive character sequence
                    count = 1;
                } else {
                    // Increment count for consecutive characters
                    count++;
                    j++;
                }
            }
            // Update max_count for the last consecutive character sequence
            max_count = Math.max(max_count, count);
            return max_count;
        } else {
            // If the length of the string is 1 or 0, max power is 1
            return 1;
        }
    }
}
