class Solution {
    // Method to calculate the minimum operations required
    public int minOperations(int[] nums) {

        // HashMap to store the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Variable to store the minimum operations required
        int minimum_operations_required = 0;

        // Count the frequency of each element in the array
        for (int elements = 0; elements < nums.length; elements++) {
            // Update the frequency in the map
            map.put(nums[elements], map.getOrDefault(nums[elements], 0) + 1);
        }

        // Iterate over the values (frequencies) in the map
        for (Integer value : map.values()) {
            // If any value is 1, it means there is an element occurring only once,
            // and it is not possible to group it with others, so return -1.
            if (value == 1) {
                return -1;
            }

            // Calculate the minimum operations required for each group
            minimum_operations_required += (value + 2) / 3;
        }

        // Return the total minimum operations required
        return minimum_operations_required;
    }
}
