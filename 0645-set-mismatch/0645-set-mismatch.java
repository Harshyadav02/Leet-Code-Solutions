class Solution {
   public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2];
        Arrays.sort(nums) ;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                ans[0] = nums[i];
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                ans[1] = nums[i] + 1;
            }
        }

        if (nums[0] != 1) {
            ans[1] = 1;
        } else if (nums[n - 1] != n) {
            ans[1] = n;
        }

        return ans;
    }



}