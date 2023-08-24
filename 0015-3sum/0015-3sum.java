class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> nestedList = new ArrayList<>();
        Set<List<Integer>> uniqueTriplets = new HashSet<>(); // To ensure uniqueness
        
        for(int i = 0; i < nums.length - 2; i++) {
            HashMap<Integer, Boolean> hash = new HashMap<>();
            
            for(int j = i + 1; j < nums.length; j++) {
                int third_ele = -(nums[i] + nums[j]);

                if (hash.containsKey(third_ele)) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(third_ele);
                    
                    Collections.sort(triplet); // Sort the triplet to ensure uniqueness
                    uniqueTriplets.add(triplet);
                } else {
                    hash.put(nums[j], true);
                }
            }
        }
        
        nestedList.addAll(uniqueTriplets); // Convert set back to list
        
        return nestedList;
    }
}
