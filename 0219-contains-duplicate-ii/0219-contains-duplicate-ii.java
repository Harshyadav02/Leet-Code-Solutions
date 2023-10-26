import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Create a HashMap to store the indices of each unique number in the input array.
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Iterate through the 'nums' array.
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // If 'num' is not in the map keys, create a new entry with 'num' as the key
            // and a list containing the current index 'i' as the value.
            if (!map.containsKey(num)) {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                map.put(num, indexList);
            } 
            // If 'num' is already a key in the map, append the current index 'i' to the
            // list associated with that key.
            else {
                map.get(num).add(i);
            }
        }

        // Iterate through the values (which are lists of indices) in the map.
        for (List<Integer> indices : map.values()) {
            // If the length of the list is 2, check if the difference between the two indices is less than or equal to 'k'.
            if (indices.size() == 2) {
                if (indices.get(1) - indices.get(0) <= k) {
                    return true;
                }
            }
            // If the length of the list is greater than 2, compare each pair of indices to check if the difference is less than or equal to 'k'.
            if (indices.size() > 2) {
                for (int x = 0; x < indices.size() - 1; x++) {
                    for (int y = x + 1; y < indices.size(); y++) {
                        if (indices.get(y) - indices.get(x) <= k) {
                            return true;
                        }
                    }
                }
            }
        }

        // If no duplicates with a difference of at most 'k' were found, return false.
        return false;
    }
}
