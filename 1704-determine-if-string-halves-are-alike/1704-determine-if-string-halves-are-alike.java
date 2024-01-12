class Solution {
    // Function to check if halves of the string are alike in terms of vowel count
    public boolean halvesAreAlike(String s) {
        // Calculate the length of half of the string
        int length = s.length() / 2;
        // Variables to store vowel counts for the first and second halves
        int firstHalf = 0 ;
        int secondHalf = 0;

        // String containing all vowels in both lowercase and uppercase
        String vowels = "aeiouAEIOU" ;

        // Loop through the first half of the string
        for(int index = 0; index < length; index++) {
            // Get the character at the current index
            char character = s.charAt(index);
            // Check if the character is a vowel and increment the count if true
            if(vowels.contains(String.valueOf(character))) {
                firstHalf++;
            }
        }

        // Loop through the second half of the string
        for(int index = length; index < s.length(); index++) {
            // Get the character at the current index
            char character = s.charAt(index);
            // Check if the character is a vowel and increment the count if true
            if(vowels.contains(String.valueOf(character))) {
                secondHalf++;
            }
        }

        // Check if the counts of vowels in both halves are equal and return the result
        return (firstHalf == secondHalf) ? true : false ;
    }
}
