class Solution {
    public String addStrings(String num1, String num2) {
        return addStringsRecursive(num1, num2, num1.length() - 1, num2.length() - 1, 0);
    }

    private String addStringsRecursive(String num1, String num2, int index1, int index2, int carry) {
        if (index1 < 0 && index2 < 0) {
            return carry == 0 ? "" : String.valueOf(carry);
        }
        
        int digit1 = index1 >= 0 ? num1.charAt(index1) - '0' : 0;
        int digit2 = index2 >= 0 ? num2.charAt(index2) - '0' : 0;
        
        int sum = digit1 + digit2 + carry;
        int currentDigit = sum % 10;
        carry = sum / 10;
        
        return addStringsRecursive(num1, num2, index1 - 1, index2 - 1, carry) + currentDigit;
    }
}
