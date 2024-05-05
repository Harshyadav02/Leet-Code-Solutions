class Solution {
      public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int carry = 0;
        int i = num.length - 1; // Start from the least significant digit of num
        while (i >= 0 || k > 0 || carry > 0) {
            if (i >= 0) {
                carry += num[i--];
            }
            if (k > 0) {
                carry += k % 10;
                k /= 10;
            }
            result.add(0, carry % 10); // Add the least significant digit to the result
            carry /= 10; // Update carry for the next iteration
        }
        return result;
    }
}