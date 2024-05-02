

// Define a class named Solution
class Solution {
    // Method to find the maximum negative number's absolute value in the array
    public int findMaxK(int[] nums) {
        // Create a HashMap to store the index-value pairs of the array
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Variable to store the current number being processed
        int number = 0;

        // Variable to store the maximum absolute value of negative numbers found
        int max_number = -1;

        // Populate the HashMap with index-value pairs from the array
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }

        // Iterate through the array to find the maximum absolute value of negative numbers
        for (int i = 0; i < nums.length; i++) {
            // Check if the current number is negative
            if (nums[i] < 0) {
                // Check if the absolute value of the current number exists in the HashMap
                if (map.containsValue(Math.abs(nums[i]))) {
                    // Update the 'number' variable with the absolute value of the current number
                    number = Math.abs(nums[i]);
                    // Update the 'max_number' variable with the maximum absolute value found so far
                    max_number = Math.max(number, max_number);
                }
            }
        }
        
        // Return the maximum absolute value of negative numbers found
        return max_number;
    }
}
