public class Solution {
  public int[] findDiagonalOrder(List<List<Integer>> nums) {
    List<Integer> ans = new ArrayList<>();
    Map<Integer, List<Integer>> keyToNums = new HashMap<>(); // Map to store elements from the same diagonal (key = row + col)
    int maxKey = 0; // Variable to track the maximum key value

    // Iterate through the rows of the 2D list
    for (int i = 0; i < nums.size(); ++i)
      // Iterate through the elements in the current row
      for (int j = 0; j < nums.get(i).size(); ++j) {
        // Calculate the key for the current diagonal (sum of row and col indices)
        final int key = i + j;

        // Add the current element to the corresponding list in the map
        keyToNums.putIfAbsent(key, new ArrayList<>());
        keyToNums.get(key).add(nums.get(i).get(j));

        // Update the maximum key value
        maxKey = Math.max(key, maxKey);
      }

    // Iterate through the keys in the map up to the maximum key value
    for (int i = 0; i <= maxKey; ++i)
      // Iterate through the elements in reverse order and add them to the result list
      for (int j = keyToNums.get(i).size() - 1; j >= 0; --j)
        ans.add(keyToNums.get(i).get(j));

    // Convert the list to an array and return the result
    return ans.stream().mapToInt(Integer::intValue).toArray();
  }
}
