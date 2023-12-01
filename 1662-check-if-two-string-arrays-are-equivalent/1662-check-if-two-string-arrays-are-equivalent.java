class Solution {
    // Method to check if two string arrays represent equal strings when concatenated
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        // Create StringBuffers to efficiently concatenate strings
        StringBuffer word1StringBuffer = new StringBuffer();
        StringBuffer word2StringBuffer = new StringBuffer();

        // Iterate through each string in word1 and append to word1StringBuffer
        for (int index = 0; index < word1.length; index++) {
            word1StringBuffer.append(word1[index]);
        }

        // Iterate through each string in word2 and append to word2StringBuffer
        for (int index = 0; index < word2.length; index++) {
            word2StringBuffer.append(word2[index]);
        }

        // Convert StringBuffers to Strings for comparison
        String word1String = word1StringBuffer.toString();
        String word2String = word2StringBuffer.toString();
        
        // Check if the concatenated strings from word1 and word2 are equal
        return word1String.equals(word2String);
    }
}
