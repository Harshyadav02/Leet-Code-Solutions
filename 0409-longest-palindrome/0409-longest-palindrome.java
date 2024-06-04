import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFreqMap = new HashMap<>();
        
        // Populate the HashMap with character frequencies
        for (char c : s.toCharArray()) {
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }
        
        int oddFreqCount = 0;
        int longestPalindromeLength = 0;
        
        // Iterate through the character frequencies
        for (int freq : charFreqMap.values()) {
            if (freq % 2 == 0) {
                longestPalindromeLength += freq;
            } else {
                longestPalindromeLength += freq - 1;
                oddFreqCount++;
            }
        }
        
        // If there are characters with odd frequency, add 1 to the longest palindrome length
        if (oddFreqCount > 0) {
            return longestPalindromeLength + 1;
        } else {
            return longestPalindromeLength;
        }
    }
}
