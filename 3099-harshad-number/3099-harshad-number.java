public class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        // Convert integer to string to access its digits
        String xStr = Integer.toString(x);
        
        // Calculate the sum of digits
        int digitSum = 0;
        for (int i = 0; i < xStr.length(); i++) {
            digitSum += Character.getNumericValue(xStr.charAt(i));
        }
        
        // Check if x is divisible by the sum of its digits
        if (x % digitSum == 0) {
            return digitSum;
        } else {
            return -1;
        }
    }
}
