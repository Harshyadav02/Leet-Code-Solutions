class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        
        int emptyBottle = numBottles;
        int drunkedBottle = numBottles;
        
        while(emptyBottle >= numExchange){
            
            emptyBottle -= numExchange;
            drunkedBottle ++;
            emptyBottle ++;
            numExchange ++;
        }
        
        return drunkedBottle;
    }
}