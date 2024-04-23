public class Solution {
    public int sumOfSquares(int[] nums) {
        // Get the length of the nums array
        int n = nums.length;
        
        // Initialize a variable to store the sum of squares of special elements
        int squareSum = 0;
        
        // Iterate over numbers from 1 to n (inclusive)
        for (int i = 1; i <= n; i++) {
            // Check if i divides n evenly (i is a divisor of n)
            if (n % i == 0) {
                // If i divides n evenly, it means nums[i-1] is a special element,
                // so add its square to the squareSum
                squareSum += nums[i - 1] * nums[i - 1];
            }
        }
        
        // Return the sum of squares of special elements
        return squareSum;
    }
}
