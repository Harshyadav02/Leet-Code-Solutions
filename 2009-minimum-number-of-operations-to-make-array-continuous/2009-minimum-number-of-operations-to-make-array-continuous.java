class Solution {
  public int minOperations(int[] nums) {
    // Get the length of the input array.
    final int n = nums.length;
    
    // Initialize the answer variable to the length of the array.
    int ans = n;

    // Sort the input array in ascending order.
    Arrays.sort(nums);
    
    // Remove duplicate values from the sorted array and store the result back in 'nums'.
    nums = Arrays.stream(nums).distinct().toArray();

    // Iterate through unique values in the sorted array.
    for (int i = 0; i < nums.length; ++i) {
      // Define the starting and ending values for a possible sequence.
      final int start = nums[i];
      final int end = start + n - 1;
      
      // Find the index of the first element greater than 'end' in the 'nums' array.
      final int index = firstGreater(nums, end);
      
      // Calculate the length of the unique elements in the current sequence and update 'ans' accordingly.
      final int uniqueLength = index - i;
      ans = Math.min(ans, n - uniqueLength);
    }

    // Return the minimum number of operations needed to create a sequence of unique elements.
    return ans;
  }

  // Helper function to find the index of the first element greater than the target in a sorted array.
  private int firstGreater(int[] nums, int target) {
    int l = 0;
    int r = nums.length;

    while (l < r) {
      final int m = (l + r) / 2;
      if (nums[m] > target)
        r = m;
      else
        l = m + 1;
    }

    return l;
  }
}
