class Solution {
    public int minOperations(String s) {
        // Variables to count operations for '0' and '1'
        int operationsForZero = 0, operationsForOne = 0;

        // Length of the input string
        int length = s.length();

        // Iterate through the characters of the string
        for (int i = 0; i < length; i++) {
            // Get the current character
            char currentChar = s.charAt(i);

            // Check the position in an alternating string (even or odd index)
            if (i % 2 == 0) {
                // If the character is '1', increment operations for '0'
                if (currentChar == '1')
                    operationsForZero++;
                // If the character is '0', increment operations for '1'
                else
                    operationsForOne++;
            } else {
                // If the character is '1', increment operations for '1'
                if (currentChar == '1')
                    operationsForOne++;
                // If the character is '0', increment operations for '0'
                else
                    operationsForZero++;
            }
        }

        // Return the minimum of operations needed for '0' and '1'
        return Math.min(operationsForZero, operationsForOne);
    }
}
