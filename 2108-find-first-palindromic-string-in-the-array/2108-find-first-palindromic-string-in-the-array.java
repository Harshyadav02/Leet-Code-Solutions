class Solution {
    public String firstPalindrome(String[] words) {
        String palindromicString = "";
        for (int index = 0; index < words.length; index++) {
            palindromicString = isPalindrome(words[index]);
            if (!palindromicString.equals("")) {
                return palindromicString;
            }
        }
        return palindromicString;
    }

    private String isPalindrome(String string) {
        String reversed = "";

        for (int ch = string.length() - 1; ch >= 0; ch--) {
            reversed += string.charAt(ch);
        }

        if (reversed.equals(string)) {
            return string;
        }
        return "";
    }
}
