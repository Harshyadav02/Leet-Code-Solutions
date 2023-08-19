class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1; // Initialize carry to 1 for the addition
        
        for (int i = digits.length - 1; i >= 0; i--) {
            int total = digits[i] + carry;
            digits[i] = total % 10;
            carry = total / 10;
        }

        // If there's a carry left, add it as a new most significant digit
        if (carry != 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        } else {
            return digits;
        }
    }
}
