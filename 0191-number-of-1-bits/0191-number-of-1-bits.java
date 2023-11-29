public class Solution {
    // Method to count the number of '1' bits in the binary representation of an unsigned integer n
    // (Note: The input parameter n is treated as an unsigned value)
    public int hammingWeight(int n) {
        
        // Variable to store the count of '1' bits
        int oneCount = 0;

        // Continue the loop until all bits in n are processed
        while (n != 0) {

            // Extract the last digit (rightmost bit) of n
            int temp = n % 10;
         
            // Add the last bit to the count if it is '1'
            oneCount += (temp & 1);

            // Right shift n by 1 to process the next bit
            n >>>= 1;
        }

        // Return the total count of '1' bits
        return oneCount;
    }
}
