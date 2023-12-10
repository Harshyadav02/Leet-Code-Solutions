class Solution {
    
     public int[][] transpose(int[][] matrix) {
        // Get the dimensions of the original matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a new matrix with swapped dimensions for the transposed result
        int[][] transposedMatrix = new int[cols][rows];

        // Iterate through the original matrix and fill the transposed matrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Swap row and column indices to transpose the element
                transposedMatrix[col][row] = matrix[row][col];
            }
        }

        // Return the transposed matrix
        return transposedMatrix;
    }
}