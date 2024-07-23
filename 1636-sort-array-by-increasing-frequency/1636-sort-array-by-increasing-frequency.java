import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] frequencySort(int[] nums) {
        // Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Sort the elements first by frequency and then by value in reverse order
        List<Integer> sortedList = Arrays.stream(nums)
                .boxed()
                .sorted((a, b) -> {
                    
                    int freqCompare = frequencyMap.get(a).compareTo(frequencyMap.get(b));
                  
                    if (freqCompare != 0) {
                        return freqCompare;
                    } else {
                        return b.compareTo(a);
                    }
                })
                .collect(Collectors.toList());

        
        int[] sortedArray = sortedList.stream().mapToInt(Integer::intValue).toArray();
        return sortedArray;
    }
}
