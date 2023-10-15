class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }
            
            while (left < right && nums[right] % 2 != 0) {
                right--;
            }
            
            if (left < right) {
                // Swap the even and odd elements
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        
        return nums;
    }
}
