class Solution {
    int total_palindrome;

    public int countSubstrings(String s) {
        total_palindrome = s.length();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j++) {
                if (checkPalindrome(s.substring(i, j))) {
                    total_palindrome++;
                }
            }
        }

        return total_palindrome;
    }

    private boolean checkPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
