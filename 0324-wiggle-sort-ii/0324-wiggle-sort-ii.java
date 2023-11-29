class Solution {
    // Method to perform wiggle sort on the input array
    public void wiggleSort(int[] nums) {
        // Step 1: Sort the array in ascending order
        Arrays.sort(nums);

        // Find the middle index
        int mid = (0 + nums.length - 1) / 2;
        // Set pointers for the left and right portions of the array
        int right = nums.length - 1, left = mid, iterator = 0;

        // Create a helper array to store the wiggle sorted elements
        int helper_array[] = new int[nums.length];

        // Step 2: Perform the wiggle sort
        while (left >= 0 && right >= mid && iterator < helper_array.length) {
            // Take an element from the left portion
            helper_array[iterator++] = nums[left--];
            
            // If right pointer is not at mid, take an element from the right portion
            if (right != mid) {
                helper_array[iterator++] = nums[right--];
            }
        }

        // Step 3: Copy the sorted elements back to the original array
        for (int index = 0; index < helper_array.length; index++) {
            nums[index] = helper_array[index];
        }
    }
}
