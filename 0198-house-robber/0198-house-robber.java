class Solution {
    public int rob(int[] nums) {
        // Create an array to store already computed results for each house
        int array[] = new int[nums.length];

        // Initialize the array with -1 to mark that no value has been computed yet
        Arrays.fill(array, -1);

        // Call the recursive helper function to calculate the total money that can be robbed
        int totalMoney = sum(nums, nums.length - 1, array);

        // Return the result
        return totalMoney;
    }

    private int sum(int nums[], int length, int array[]) {
        // Base case: if there are no more houses, return 0
        if (length < 0) {
            return 0;
        }

        // Base case: if there is only one house, return its value
        if (length == 0) {
            return nums[0];
        }

        // If the value for the current house has already been computed, return it
        if (array[length] != -1) {
            return array[length];
        }

        // Calculate the sum of money when the current house is included in the robbery
        int include = sum(nums, length - 2, array) + nums[length];

        // Calculate the sum of money when the current house is excluded from the robbery
        int exclude = sum(nums, length - 1, array);

        // Choose the maximum of the two options and store it in the array for future reference
        array[length] = Math.max(include, exclude);

        // Return the computed value for the current house
        return array[length];
    }
}
