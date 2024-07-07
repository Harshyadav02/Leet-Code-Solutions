class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maxBottles = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            maxBottles += newBottles; 
            emptyBottles = emptyBottles % numExchange + newBottles; 
        }

        return maxBottles;
    }
} 