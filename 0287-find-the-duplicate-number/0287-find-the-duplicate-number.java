class Solution {
    public int findDuplicate(int[] nums) {
            
        HashMap<Integer , Integer> hash = new HashMap<>();
        
         for (int key : nums) {
            // If key is present already, increase the value by 1
            if (hash.containsKey(key)) {
                hash.put(key, hash.get(key) + 1);
            } else {
                hash.put(key, 1);
            }
        }
        
        for(int keys : hash.keySet()){
            
           if (hash.get(keys) > 1) {
                return keys;
            }
        }
    return -1;
    }
    
}