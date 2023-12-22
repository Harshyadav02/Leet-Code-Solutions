class Solution {
    public int maxScore(String s) {
        
        // Initialize counters for zeros, ones, and the maximum score
        long zeroCount = 0, onesCount = 0, maxScore = 0;

        // StringBuilder objects to store left and right substrings
        StringBuilder leftString = new StringBuilder();
        StringBuilder rightString = new StringBuilder();

        // If the length of the string is less than or equal to 2
        if (s.length() <= 2) {
            // Check the first character and update counts accordingly
            if (s.charAt(0) == '0') {
                zeroCount++;
            }
            if (s.charAt(1) == '1') {
                onesCount++;
            }
            // Update the maximum score with the current counts
            maxScore = Math.max(maxScore, zeroCount + onesCount);
        }

        // If the length of the string is greater than 2
        else {
            // Iterate through the string until the second-to-last character
            for (int index = 0; index < s.length() - 1; index++) {
                
                // Build the left substring
                leftString.append(s.substring(index, index + 1));

                // Count the number of zeros in the left substring
                zeroCount = leftString.chars().filter(ch -> ch == '0').count();

                // Build the right substring
                rightString.append(s.substring(index + 1));

                // Count the number of ones in the right substring
                onesCount = rightString.chars().filter(ch -> ch == '1').count();

                // Update the maximum score with the current counts
                maxScore = Math.max(maxScore, zeroCount + onesCount);

                // Clear the right substring for the next iteration
                rightString.setLength(0);
            }
        }
        
        // Return the maximum score as an integer
        return (int) maxScore;
    }
}
