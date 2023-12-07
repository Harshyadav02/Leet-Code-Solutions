class Solution {
  // Function to find the largest odd number by iterating through the digits
  public String largestOddNumber(String num) {
    // Iterate through the digits of the input number starting from the rightmost digit
    for (int i = num.length() - 1; i >= 0; i--) {
      // Check if the current digit is odd by using the modulo operator (%)
      if ((num.charAt(i) - '0') % 2 == 1) {
        // If the current digit is odd, return the substring from the beginning of the number
        // up to and including the current digit, as this will be the largest odd number
        return num.substring(0, i + 1);
      }
    }
    // If no odd digits are found, return an empty string indicating that there is no odd number
    return "";
  }
}
