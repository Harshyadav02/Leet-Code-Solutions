class Solution {
    // This method takes a string as input and sorts the vowels in ascending order based on their ASCII values.
    public String sortVowels(String s) {
        // Create an ArrayList to store ASCII values of vowels.
        ArrayList<Integer> asciiList = new ArrayList<>();

        // Convert the input string to a character array.
        char ch[] = s.toCharArray();

        // Iterate through each character in the array.
        for (int i = 0; i < ch.length; i++) {
            // Check if the current character is a vowel (both lowercase and uppercase).
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                // If it is a vowel, add its ASCII value to the list and replace the character with '_'.
                asciiList.add((int) (ch[i]));
                ch[i] = '_';
            }
        }

        // Sort the ASCII values of vowels in ascending order.
        Collections.sort(asciiList);

        // Initialize a counter for iterating through the sorted ASCII values.
        int j = 0;
        // Iterate through the character array to replace '_' with sorted vowels.
        for (int i = 0; i < ch.length; i++) {
            // Check if there are still elements in the ASCII list.
            if (asciiList.size() > 0) {
                // If the current character is '_', replace it with the next sorted vowel.
                if (ch[i] == '_') {
                    ch[i] = (char) (int) (asciiList.get(j));
                    j++;
                }
            }
        }

        // Convert the character array back to a string and return the result.
        return new String(ch);
    }
}
