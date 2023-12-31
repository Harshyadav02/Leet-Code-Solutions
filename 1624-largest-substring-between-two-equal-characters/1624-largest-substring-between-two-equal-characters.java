

public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // Initialize the maximum length variable to -1
        int maxLength = -1;

        // Create a HashMap to store the character and its last index
        HashMap<Character, Integer> map = new HashMap<>();

        // Iterate through each character in the string
        for (int characterIndex = 0; characterIndex < s.length(); characterIndex++) {

            // Get the current character
            char ch = s.charAt(characterIndex);

            // Check if the character is already in the HashMap
            if (map.containsKey(ch)) {
                // If yes, get the previous index of the character
                int prevIndex = map.get(ch);

                // Update the maxLength with the maximum of the current maxLength and the
                // difference between the current index and the previous index - 1
                maxLength = Math.max(maxLength, characterIndex - prevIndex - 1);
            } else {
                // If the character is not in the HashMap, put it in the HashMap with its current index
                map.put(ch, characterIndex);
            }
        }

        // Return the maximum length between equal characters
        return maxLength;
    }
}
