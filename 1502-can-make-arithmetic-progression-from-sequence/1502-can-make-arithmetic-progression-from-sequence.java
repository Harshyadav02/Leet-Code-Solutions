import java.util.Arrays;

class Solution {
    // Function to check if an array forms an arithmetic progression
    public boolean canMakeArithmeticProgression(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Initialize a flag to indicate whether the array is an arithmetic progression
        boolean isArithmetic = true;

        // Calculate the common difference between elements in the sorted array
        int difference = arr[1] - arr[0];

        // Iterate through the array to check the arithmetic progression property
        for (int i = 0; i < arr.length - 1; i++) {
            // If the difference is not consistent, set the flag to false and break the loop
            if (difference != arr[i + 1] - arr[i]) {
                isArithmetic = false;
                break;
            }
        }

        // Return the result indicating whether the array is an arithmetic progression
        return isArithmetic;
    }
}
