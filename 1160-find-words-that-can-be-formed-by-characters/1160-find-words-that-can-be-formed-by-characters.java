class Solution {
    public  int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character in chars
        for (char c : chars.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int totalLength = 0;

        // Check each word in the array
        for (String word : words) {
            Map<Character, Integer> wordCount = new HashMap<>();
            boolean validWord = true;

            // Check if the word can be formed using characters in chars
            for (char c : word.toCharArray()) {
                if (charCount.containsKey(c) && charCount.get(c) > 0) {
                    charCount.put(c, charCount.get(c) - 1);
                    wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
                } else {
                    validWord = false;
                    break;
                }
            }

            // If the word is valid, add its length to the total length
            if (validWord) {
                totalLength += word.length();
            }

            // Restore the counts for the current word
            for (Map.Entry<Character, Integer> entry : wordCount.entrySet()) {
                charCount.put(entry.getKey(), charCount.get(entry.getKey()) + entry.getValue());
            }
        }

        return totalLength;
    }
}