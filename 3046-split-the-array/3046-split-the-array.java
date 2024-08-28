class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        
         Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count frequency of each element in the array
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Check if any element has a frequency greater than 2
        for (int freq : frequencyMap.values()) {
            if (freq > 2) {
                return false;
            }
        }
        
        // Check if we have at least nums.length / 2 distinct elements
        return frequencyMap.size() >= nums.length / 2;

    }
}