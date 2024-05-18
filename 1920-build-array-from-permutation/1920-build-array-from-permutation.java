class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];  // Initialize ans with the same length as nums
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];  // Assign the value as per the rule
        }
        return ans;
    }
}