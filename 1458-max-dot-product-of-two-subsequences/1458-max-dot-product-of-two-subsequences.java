class Solution {
    public int maxDotProduct(int[] A, int[] B) {
        int m = A.length; // Length of array A
        int n = B.length; // Length of array B

        // dp[i][j] := max dot product of two subseqs A[0..i) and B[0..j)
        // Initialize a 2D DP array with dimensions (m+1) x (n+1)
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the DP array with negative infinity
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }

        // Iterate through array A
        for (int i = 0; i < m; i++) {
            // Iterate through array B
            for (int j = 0; j < n; j++) {
                // Update the DP table based on the maximum dot product considering
                // current elements from A and B
                dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], Math.max(0, dp[i][j]) + A[i] * B[j]);
            }
        }

        // Return the maximum dot product
        return dp[m][n];
    }
}
