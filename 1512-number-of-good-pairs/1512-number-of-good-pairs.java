class Solution {
    public int numIdenticalPairs(int[] nums) {
        
      /* 
      
      Brute force approch 
      int count = 0;
        
        for(int i=0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                
                if(nums[i] == nums[j]){
                    
                    count ++;
                }
            }
        }
        return count; 
        
        */
        
        
//         Optimized approch  using hashmap
        
        
        // varibale to hold the counts of tatoal number of pair
        int count = 0 ;
            
        HashMap <Integer , Integer > map = new HashMap<>();
        
        for(int number : nums){
            // checking if the map contains the key or not if yes then increase the value by 1 
            if(map.containsKey(number)){
                
                count += map.get(number);
                map.put(number , map.get(number)+1);    
            }

            // if the map donot contain the key     
            else{
                map.put(number , 1);
            }
        }
        // returning the final answer 
        return count;
    }
}
