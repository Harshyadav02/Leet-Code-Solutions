class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // This variable will store the count of elements not equal to val

        // Loop through the array and move elements not equal to val to the beginning
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}