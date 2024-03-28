class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {

        HashMap<Integer , Integer> numsHashMap = new HashMap<>();
       
        
        
        for(int index=0; index<nums.length; index++){

            numsHashMap.put(nums[index], index);
        }
        
        for(int array[] : operations){
            
            int index = numsHashMap.get(array[0]) ;
            int originalValue = array[0];
            int replacingValue = array[1] ;
            
            
            nums[index] = replacingValue ;
            numsHashMap.put(replacingValue , numsHashMap.remove(originalValue)) ;
            
        }
        
        return nums ;
        
    }
}