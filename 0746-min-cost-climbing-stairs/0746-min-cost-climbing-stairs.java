class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int cost0=cost[0];
        int cost1=cost[1];
        for(int i = 2; i< cost.length; i++){
            int curr_cost= cost[i]+Math.min(cost0, cost1);
            cost0=cost1;
            cost1= curr_cost;
        }
        return Math.min(cost0, cost1);
    }
}