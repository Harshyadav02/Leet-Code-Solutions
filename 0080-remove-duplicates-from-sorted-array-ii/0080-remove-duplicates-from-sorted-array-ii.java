class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length; // No need to remove duplicates if there are 2 or fewer elements.
        }
        
        int count = 2; // Counter for the number of allowed duplicates.
        
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[count - 2]) {
                nums[count] = nums[i]; // Shift unique element to the next available position.
                count++;
            }
        }
        
        return count;
    }
}
