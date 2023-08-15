class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         HashMap<Integer, Integer> hashMap = new HashMap<>(); // Create a hash map to store value-index pairs
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (hashMap.containsKey(complement)) {
                return new int[]{hashMap.get(complement), i}; // Return the indices if the complement is found
            }
            
            hashMap.put(nums[i], i); // Store the current value with its index in the hash map
        }
        
        return null; // Return null if no such pair is found
    }
}