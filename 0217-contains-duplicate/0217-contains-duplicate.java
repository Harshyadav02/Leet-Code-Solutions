class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        
        if (set.size() < nums.length){
            return true;
        } 
        
        return false ;
    }
}