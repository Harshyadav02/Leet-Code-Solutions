class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         HashMap<Integer, Integer> hashMap = new HashMap<>(); 
        
        for (int i = 0; i < nums.length; i++) {
            int ans = target - nums[i];
            
            if (hashMap.containsKey(ans)) {
                return new int[]{hashMap.get(ans), i+1}; 
            }
            
            hashMap.put(nums[i], i+1); 
        }
        
        return null; 
    }
}