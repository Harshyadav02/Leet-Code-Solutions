public class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
     
        Set<String> dictionarySet = new HashSet<>(dictionary);

       
        String[] words = sentence.split("\\s+");

      
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

           
            for (int n = 1; n <= word.length(); n++) {
                if (dictionarySet.contains(word.substring(0, n))) {
                    words[i] = word.substring(0, n);
                    break; 
                }
            }
        }

        return String.join(" ", words);
    }
}
