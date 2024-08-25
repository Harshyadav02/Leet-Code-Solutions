class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ans[] = new int[2];
        int oneCount=0;
        for(int row=0;row<mat.length;row++){

            for(int col=0;col<mat[row].length;col++){

                if(mat[row][col]==1){
                    oneCount++;
                }
            }

            if(ans[1]<oneCount){
                ans[0] = row;
                ans[1] = oneCount;
            }
            oneCount=0;
        }
        return ans;
    }
}