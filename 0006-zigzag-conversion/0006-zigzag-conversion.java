class Solution {
    public String convert(String s, int numRows) {

        // Create a 2D array to store characters in zigzag pattern
        String[][] stringArray = new String[numRows][s.length()];

        // Initialize variables for row, column, and character count
        int row = 0;
        int col = 0;
        int strCount = 0;

        // Iterate through the input string
        for (int str = 0; str < s.length(); str++) {
            // Move down the column in a zigzag pattern
            for (row = 0; row < numRows && strCount < s.length(); row++) {
                stringArray[row][col] = String.valueOf(s.charAt(strCount));
                strCount++;
            }
            
            // Move up the column in a zigzag pattern, skipping the first and last rows
            for (int i = numRows - 2; i > 0 && strCount < s.length(); i--) {
                col++;
                stringArray[i][col] = String.valueOf(s.charAt(strCount));
                strCount++;
            }
            
            // Move to the next column
            col++;
        }

        // Reconstruct the string from the 2D array
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                // Append non-empty and non-null characters to the StringBuilder
                if (stringArray[i][j] != null && !stringArray[i][j].isEmpty()) {
                    sb.append(stringArray[i][j]);
                }
            }
        }

        // Return the final zigzag converted string
        return sb.toString();
    }
}
