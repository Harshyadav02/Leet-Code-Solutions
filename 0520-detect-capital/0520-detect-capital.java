class Solution {
    public boolean detectCapitalUse(String word) {
        
        // Check if the whole word is in uppercase
        if (word.equals(word.toUpperCase())) {
            return true;
        }
        
        // Check if the whole word is in lowercase
        if (word.equals(word.toLowerCase())) {
            return true;
        }
        
        // Check if only the first letter is in uppercase and the rest are in lowercase
        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }
        
        // If none of the above cases are true, return false
        return false;
    
    }
}