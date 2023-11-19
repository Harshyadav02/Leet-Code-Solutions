class Solution {
    // Function to find the minimum pair sum in an array
    public int minPairSum(int[] nums) {
        // Initialize two pointers, one at the beginning and one at the end of the sorted array
        int i = 0, j = nums.length - 1;
        
        // Variable to store the maximum pair sum
        int max_sum = Integer.MIN_VALUE;
        
        // Variable to store the current pair sum
        int sum = 0;
        
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        // Iterate until the two pointers meet
        while (i < j) {
            // Calculate the sum of the current pair
            sum = nums[i++] + nums[j--];
            
            // Update the maximum pair sum
            max_sum = Math.max(sum, max_sum);
        }

        // Return the maximum pair sum
        return max_sum;
    }
}
