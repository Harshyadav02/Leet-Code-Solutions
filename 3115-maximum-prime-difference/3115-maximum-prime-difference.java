class Solution {
    // Method to find the maximum difference between indices of non-prime numbers
    public int maximumPrimeDifference(int[] nums) {
        // Create a list to store indices of non-prime numbers
        ArrayList<Integer> list = new ArrayList<>();
        int first = 0, last = 0;
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the number is at least 2
            if (nums[i] >= 2) {
                // Check if the number is not prime
                boolean isPrimeNumber = isPrime(nums[i]);
                // If the number is not prime, add its index to the list
                if (!isPrimeNumber) {
                    list.add(i);
                }
            }
        }
        
        // Get the indices of the first and last non-prime numbers
        first = list.get(0);
        last = list.get(list.size() - 1);
        
        // Return the difference between the indices
        return last - first;
    }
    
    // Method to check if a number is prime
    private boolean isPrime(int number) {
        // Iterate through numbers up to the square root of the given number
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            // If the number is divisible by any other number, return true (not prime)
            if (number % i == 0) {
                return true;
            }
        }
        // If no divisors are found, the number is prime (return false)
        return false;
    }
}
