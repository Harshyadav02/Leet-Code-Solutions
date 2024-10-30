class Solution {
    public int findShortestSubArray(int[] nums) {
        
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        
        for (int index = 0; index < nums.length; index++) {
            map.putIfAbsent(nums[index], new ArrayList<>());
            map.get(nums[index]).add(index);
        }
        
        int degree = 0; 
        int minLength = nums.length;

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> indices = entry.getValue();
            int frequency = indices.size();

            
            if (frequency > degree) {
                degree = frequency;
                minLength = indices.get(indices.size() - 1) - indices.get(0) + 1;
            } else if (frequency == degree) {
                minLength = Math.min(minLength, indices.get(indices.size() - 1) - indices.get(0) + 1);
            }
        }
        
        return minLength;
    }
}
