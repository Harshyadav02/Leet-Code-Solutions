import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        // Create a map to store original indices
        Map<Integer, Integer> indexMap = new HashMap<>();
        
        // Populate the index map with original indices
        for (int i = 0; i < score.length; i++) {
            indexMap.put(score[i], i);
        }
        
        // Sort the scores in descending order
        Arrays.sort(score);
        reverseArray(score);

        // Initialize the answer array
        String[] answer = new String[score.length];
        
        // Assign ranks
        for (int i = 0; i < score.length; i++) {
            int originalIndex = indexMap.get(score[i]);
            if (i == 0) {
                answer[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                answer[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                answer[originalIndex] = "Bronze Medal";
            } else {
                answer[originalIndex] = String.valueOf(i + 1);
            }
        }
        
        return answer;
    }
    
    // Helper function to reverse an array
    private void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
