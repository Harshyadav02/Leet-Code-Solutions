import java.util.*;

class Solution {
    public int similarPairs(String[] words) {
        int numberOfPairs = 0;

       
        List<Set<Character>> uniqueSets = new ArrayList<>();
        for (String word : words) {
            Set<Character> charSet = new HashSet<>();
            for (char c : word.toCharArray()) {
                charSet.add(c); 
            }
            uniqueSets.add(charSet);
        }

        
        for (int i = 0; i < uniqueSets.size(); i++) {
            for (int j = i + 1; j < uniqueSets.size(); j++) {
                if (uniqueSets.get(i).equals(uniqueSets.get(j))) {
                    numberOfPairs++;
                }
            }
        }

        return numberOfPairs;
    }
}
