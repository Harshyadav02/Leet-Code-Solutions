public class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            // Split the sentence into words using space as delimiter
            String[] words = sentence.split("\\s+");
            
            // Count the number of words in the current sentence
            int numWords = words.length;
            
            // Update maxWords if the current sentence has more words
            maxWords = Math.max(maxWords, numWords);
        }

        return maxWords;
    }
}
