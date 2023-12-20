// Define a class named Solution
class Solution {
    
    // Method to calculate the remaining money after buying two cheapest chocolates
    public int buyChoco(int[] prices, int money) {
        
        // Sort the prices array in ascending order
        Arrays.sort(prices);
        
        // Calculate the remaining money after buying the two cheapest chocolates
        int remainingMoney = money - (prices[0] + prices[1]);
        
        // If the remaining money is negative, return the original money
        // Otherwise, return the calculated remaining money
        return remainingMoney < 0 ? money : remainingMoney; 
    }
}
