class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
    int n = nums.length;
    int left = 0;
    int right = 0;
    int sum = 0;
    int minLen = n + 1;
        
    while (right < n) {
      sum += nums[right];
      while (sum >= target) {
        minLen = Math.min(minLen, right - left + 1);
        sum -= nums[left];
        left++;
      }
      right++;
    }
    return minLen <= n ? minLen : 0;
    }
}