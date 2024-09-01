class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        int twoDArray[][] = new int[m][n];
        int pointer =0;
        if(m*n!=original.length) return new int[][]{};
        for(int row=0; row<m; row++){
            for(int col=0;col<n; col++){
                twoDArray[row][col] = original[pointer++];
            }
        }
        return twoDArray;
    }
}