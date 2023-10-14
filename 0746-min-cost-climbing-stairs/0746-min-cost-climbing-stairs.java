/*class Solution {
    
     public int minCostClimbingStairs(int[] cost) {
     return Math.min(minCost(cost, cost.length - 1), minCost(cost, cost.length - 2));
 }

 private int minCost(int[] cost, int step) {
     if (step < 0) {
         return 0;
     } else if (step == 0 || step == 1) {
         return cost[step];
     } else {
         return cost[step] + Math.min(minCost(cost, step - 1), minCost(cost, step - 2));
     }
 }
    
}*/

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
