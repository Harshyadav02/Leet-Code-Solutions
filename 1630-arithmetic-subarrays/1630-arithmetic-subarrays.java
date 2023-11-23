class Solution {
    // Function to check arithmetic subarrays
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        // List to store the boolean results for each subarray
        ArrayList<Boolean> arithmeticBooleanList = new ArrayList<>();

        // Pointers to traverse the left and right arrays
        int leftArrayPointer = 0, rightArrayPointer = 0;

        // Iterate through the given ranges
        while (leftArrayPointer < l.length && rightArrayPointer < r.length) {
            // Create a sublist for the current range
            List<Integer> subList = new ArrayList<>();
            // Populate the sublist with elements from the specified range
            for (int i = l[leftArrayPointer]; i <= r[rightArrayPointer]; i++) {
                subList.add(nums[i]);
            }

            // Sort the sublist for easy arithmetic progression check
            Collections.sort(subList);

            // Check if the sublist is an arithmetic progression
            int difference = subList.get(1) - subList.get(0);
            boolean isArithmetic = true;
            // Iterate through the sublist to check the arithmetic progression property
            for (int i = 0; i < subList.size() - 1; i++) {
                if (difference != subList.get(i + 1) - subList.get(i)) {
                    // If the difference is not consistent, it is not an arithmetic progression
                    isArithmetic = false;
                    break;
                }
            }

            // Add the result to the boolean list
            arithmeticBooleanList.add(isArithmetic);

            // Move to the next range
            leftArrayPointer++;
            rightArrayPointer++;
        }

        // Return the list of boolean results for each subarray
        return arithmeticBooleanList;
    }
}
