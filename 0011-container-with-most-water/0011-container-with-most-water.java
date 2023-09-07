class Solution {
    public int maxArea(int[] height) {
        
        // variable which will contan final amount of water
        int maxWater = 0;
        
        // will track left part of array
        int leftPointer = 0;
        
        // will track right part of array
        int rightPointer = height.length-1;
        
        
        while(leftPointer < rightPointer){
            
            // calculating the height of water
            int waterHeight = Math.min(height[leftPointer] , height[rightPointer]);
            
            // calculating the width of water
            int waterWidth = rightPointer -  leftPointer ;
            
            // calculating the area of water
            int currentWater = waterHeight * waterWidth ;
            
            // Upaating the maxWater 
            maxWater = Math.max(maxWater , currentWater);
            
            
            // updating pointer 
            
            if(height[leftPointer] < height[rightPointer]){
                leftPointer ++ ;
            }
            
            else{
                rightPointer -- ;
            }
        }
        
        return maxWater ;
    }
}