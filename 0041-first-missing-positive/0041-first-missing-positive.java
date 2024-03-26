public class Solution {
    public int firstMissingPositive(int[] nums) {
        // Create a set to store unique elements from the array
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        // Check for positive numbers from 1 to n+1 (inclusive)
        for (int i = 1; i <= nums.length + 1; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }

        // If all positive numbers from 1 to n+1 are present, return n+1
        return nums.length + 1;
    }
}
