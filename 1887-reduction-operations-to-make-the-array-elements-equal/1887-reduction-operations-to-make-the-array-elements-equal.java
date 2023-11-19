class Solution {
    public int reductionOperations(int[] inputNumbers) {
       // Sort the array in ascending order.
        Arrays.sort(inputNumbers);

        // Initialize a variable to count the total number of operations.
        int totalOperationsCount = 0;

        // Iterate through the array from the end to the beginning.
        for (int currentIndex = inputNumbers.length - 1; currentIndex > 0; currentIndex--) {
            // Check if the current element is greater than the previous one.
            if (inputNumbers[currentIndex] > inputNumbers[currentIndex - 1]) {
                // Increment the count by the difference in indices.
                totalOperationsCount += inputNumbers.length - currentIndex;
            }
        }

        // Return total number of operations
        return totalOperationsCount;
    }
}