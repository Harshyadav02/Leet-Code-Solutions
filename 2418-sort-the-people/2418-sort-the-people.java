class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length; // Get the number of elements in the arrays

        for (int j = 0; j < n - 1; j++) {
            // Outer loop for the number of passes
            // After each pass, the largest element will be in its correct position at the end

            for (int i = 0; i < n - 1 - j; i++) {
                // Inner loop to compare and swap adjacent elements in the unsorted portion

                if (heights[i] < heights[i + 1]) {
                    // Compare heights and swap if they are out of order

                    // Swap names
                    String tempName = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = tempName;

                    // Swap heights
                    int tempHeight = heights[i];
                    heights[i] = heights[i + 1];
                    heights[i + 1] = tempHeight;
                }
            }
        }
        return names; // Return the sorted names in descending order of heights
    }
}
