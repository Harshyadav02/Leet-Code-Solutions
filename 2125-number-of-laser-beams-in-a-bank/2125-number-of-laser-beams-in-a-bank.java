class Solution {
    // Method to calculate the number of beams in the given bank
    public int numberOfBeams(String[] bank) {
        // Variable to store the final result
        int result = 0;
        // Variable to store the count of ones in the previous row
        int previousOnesCount = 0;

        // Iterate through each row in the bank
        for (String row : bank) {
            // Variable to store the count of ones in the current row
            int onesCount = 0;
            
            // Iterate through each character in the current row
            for (char c : row.toCharArray()) {
                // If the character is '1', increment the onesCount
                if (c == '1') {
                    ++onesCount;
                }
            }

            // If there are ones in the current row
            if (onesCount > 0) {
                // Add to the result the product of previousOnesCount and onesCount
                // This accounts for the combinations of ones between the current and previous rows
                result += previousOnesCount * onesCount;
                
                // Update previousOnesCount to the onesCount of the current row for the next iteration
                previousOnesCount = onesCount;
            }
        }

        // Return the final result
        return result;
    }
}
