class Solution {
    public int maxProfit(int[] prices) {
     int profit=0;
        int min=prices[0];
        int max =0;
        if(prices.length==0)
            return 0;
        
        for(int currentprice:prices){
            min=Math.min(min,currentprice);
            profit=currentprice-min;
            max=Math.max(max,profit);
        }
return max;
    }
}