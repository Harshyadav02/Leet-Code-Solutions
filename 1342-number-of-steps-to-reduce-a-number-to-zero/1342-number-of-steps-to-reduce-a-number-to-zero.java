class Solution {
    public int numberOfSteps(int num) {
        
        return findingCount(num , 0);
    }
    
    private int findingCount(int nums , int count) {
        
        if(nums == 0){
            return count ;
        }
        if(nums % 2 == 0){
            
           return findingCount(nums/2 , count+1);
        }
        return findingCount(nums-1 , count+1) ;
    }
}