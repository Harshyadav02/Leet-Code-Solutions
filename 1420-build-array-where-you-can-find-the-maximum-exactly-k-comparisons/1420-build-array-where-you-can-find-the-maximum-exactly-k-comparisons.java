class Solution {
    public int numOfArrays(int n, int m, int k) {
        if (k == 0) {
            return 0;
        }

        // Initialize a 3D array to store the number of ways
        // dp[i][usedElements][maxValue] represents the number of ways to have an array of length i
        // with usedElements elements used to obtain a maximum of maxValue
        int[][][] dp = new int[n + 1][k + 1][m + 1];
        int mod = 1000000007;

        // Base case: there's only one way to have an array of length 1
        // with each maximum value from 1 to m
        for (int i = 1; i <= m; i++) {
            dp[1][1][i] = 1;
        }

        // Fill the dp table based on the given conditions
        for (int length = 2; length <= n; length++) {
            for (int usedElements = 1; usedElements <= Math.min(k, length); usedElements++) {
                for (int maxValue = 1; maxValue <= m; maxValue++) {
                    // The number of ways to construct an array of length i with
                    // c elements used to obtain a maximum of j is calculated here
                    dp[length][usedElements][maxValue] = (int) ((long) dp[length - 1][usedElements][maxValue] * maxValue % mod);
                    for (int prevMaxValue = 1; prevMaxValue < maxValue; prevMaxValue++) {
                        dp[length][usedElements][maxValue] = (dp[length][usedElements][maxValue] + dp[length - 1][usedElements - 1][prevMaxValue]) % mod;
                    }
                }
            }
        }

        // Calculate the total number of ways to construct the array
        int totalWays = 0;
        for (int maxValue = 1; maxValue <= m; maxValue++) {
            totalWays = (totalWays + dp[n][k][maxValue]) % mod;
        }

        return totalWays;
    }
}
