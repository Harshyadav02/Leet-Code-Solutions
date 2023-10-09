class Solution {
  
    public int[] searchRange(int[] nums, int target) {
        
        // array to hold the occurence of target 
        
        int array [] = new int [2] ;
        
        
        // methods for finding the first and the last position of the target element 
        int first  = firstPosition(nums , target , 0) ;
        int last  = lastPosition(nums , target , nums.length -1) ;
        
        // assiging the index of the target element to array
        array[0] = first;
        array[1] = last;
        
        
        // returning the final output 
        return array ;
    }
    
    
    public int firstPosition(int nums[], int target ,int  i){
        
         // if target not present in the array  return -1
        
        if( i == nums.length) return -1 ;
        
        // if target found return the index 
        if( nums[i] == target ) return i;
        
        
        // if not found calling the function for i+1 index 
        return firstPosition(nums , target , i+1);
    }
    
    public int lastPosition(int nums[] , int target , int i){
        
        // if target not present in the array  return -1
        if( i == -1 ) return -1 ;
        
        // if found the return the index
        if(nums[i] == target) return i;
        
        // if not found calling the function for i-1 index 
        return lastPosition(nums , target , i-1);
    }
}