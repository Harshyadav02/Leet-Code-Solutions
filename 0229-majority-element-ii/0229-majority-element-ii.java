class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
        // list which will contain all the elemnts which appear more then n/3 times
        ArrayList <Integer> list = new ArrayList<>();
        
        // map which will track the number of appreance of the elemnts
        HashMap<Integer , Integer>  map = new HashMap<>();
        
        for(int i =0; i<nums.length; i++){
            
            if(map.containsKey(nums[i])){
                
                map.put(nums[i] , map.get(nums[i])+1 );
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        
        // retriving the key from amp
        for(Integer key : map.keySet()){
            
            // if the key appear more then n/3 times append it into the arraylist
            if(map.get(key) > (nums.length/3)){
                list.add(key);
            }
        }
        
        // final output
    return list; 
    }
}