class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return climbStairsHelper(n, dp);
    }

    private int climbStairsHelper(int n, int[] dp) {
        // Base cases
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        // Check if result for 'n' is already computed
        if (dp[n] != 0) {
            return dp[n];
        }

        // Compute and store the result in the array
        dp[n] = climbStairsHelper(n - 1, dp) + climbStairsHelper(n - 2, dp);

        return dp[n];
    }
}
