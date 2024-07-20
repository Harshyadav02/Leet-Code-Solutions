class Solution {
    public void setZeroes(int[][] matrix) {

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for(int row=0; row<matrix.length; row++){

            for(int col=0; col<matrix[row].length; col++){

                if(matrix[row][col]==0){
                    
                    rowSet.add(row);
                    colSet.add(col);
                }
            }
        }
        // row ko 0
        for (int row : rowSet) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = 0;
            }
        }
        // col ko 0
        for (int col : colSet) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = 0;
            }
        }
        // return matrix;
    }
}