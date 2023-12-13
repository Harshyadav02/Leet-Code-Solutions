class Solution {
    public int numSpecial(int[][] mat) {
        // Get the number of rows and columns in the matrix
        int m = mat.length, n = mat[0].length;
        
        // Arrays to store the sum of elements in each row and each column
        int[] rows = new int[m];
        int[] cols = new int[n];
        
        // Calculate the sum of elements for each row and each column
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                rows[row] += mat[row][col];
                cols[col] += mat[row][col];
            }
        }
        
        // Variable to store the total count of special positions
        int totalSpecialPostion = 0;
        
        // Iterate through the matrix to find special positions
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                // Check if the current position has a value of 1 and if it's the only 1 in its row and column
                if (mat[row][col] == 1 && rows[row] == 1 && cols[col] == 1) {
                    totalSpecialPostion++;
                }
            }
        }
        
        // Return the total count of special positions
        return totalSpecialPostion;
    }
}
