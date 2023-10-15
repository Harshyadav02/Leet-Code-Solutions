class Solution {
     public  int findMaxConsecutiveOnes(int[] nums) {
        
        // variables for tracking the count of 1 and retriving the elemnts form array       
        int max_count = 0 ;
        int count = 0 ;
        int i  = 0 , j = 0 ;
        
         
       while( j < nums.length)
       {
           // ensuring that the loop track only 1's from the array 
           if(nums[i] !=0) {

                if(nums[i] == nums[j]) {

                    count ++ ;
                    j++ ;
                }
               else{
                   j++ ;
                   i = j ;
                   max_count = Math.max(count , max_count) ;
                   count = 0;
               }
           }
           
           else{
               i++ ;
               j = i ;
           }
       }
       
      return Math.max(count , max_count) ;  
        
    }
}