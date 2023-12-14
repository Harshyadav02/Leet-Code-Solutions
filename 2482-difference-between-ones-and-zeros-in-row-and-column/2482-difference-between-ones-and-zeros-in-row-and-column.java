class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        // Lists to store counts of ones and zeros for each row and column
        ArrayList<Integer> onesRowi  = new ArrayList<>();
        ArrayList<Integer> zeroRowi  = new ArrayList<>();
        ArrayList<Integer> zeroColj  = new ArrayList<>();
        ArrayList<Integer> onesColj  = new ArrayList<>();
        
        // Matrix to store the final difference values
        int diff[][] = new int[grid.length][grid[0].length] ;

        // Calculate counts for each row
        for(int row = 0; row < grid.length; row++){
            int rowZeroCount = 0;
            int rowOnesCount = 0;

            // Iterate through each column in the current row
            for(int col = 0; col < grid[row].length; col++){
                // Count ones and zeros in the current row
                if(grid[row][col] == 0){
                    rowZeroCount++;
                } else {
                    rowOnesCount++;
                } 
            }

            // Add counts to the respective lists
            onesRowi.add(rowOnesCount);
            zeroRowi.add(rowZeroCount);
        }

        // Calculate counts for each column
        for(int col = 0; col < grid[0].length; col++){
            int colZeroCount = 0;
            int colOnesCount = 0;

            // Iterate through each row in the current column
            for(int row = 0; row < grid.length; row++){
                // Count ones and zeros in the current column
                if(grid[row][col] == 0){
                    colZeroCount++;
                } else {
                    colOnesCount++;
                } 
            }

            // Add counts to the respective lists
            onesColj.add(colOnesCount);
            zeroColj.add(colZeroCount);
        }

        // Calculate the difference matrix using the provided formula
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                diff[i][j] = onesRowi.get(i) + onesColj.get(j) - zeroRowi.get(i) - zeroColj.get(j);
            }
        }

        // Return the final difference matrix
        return diff;
    }
}
