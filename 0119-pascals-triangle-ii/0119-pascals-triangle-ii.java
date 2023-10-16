class Solution {
  public List<Integer> getRow(int rowIndex) {
    // Create an array to store the elements of the Pascal's Triangle row.
    Integer[] ans = new Integer[rowIndex + 1];
    // Initialize all elements with 1 because the first and last elements are always 1 in Pascal's Triangle.
    Arrays.fill(ans, 1);

    // Loop to calculate the elements in the row.
    for (int i = 2; i < rowIndex + 1; ++i) {
      for (int j = 1; j < i; ++j) {
        // Calculate the value of the current element by adding the values of the two elements above it.
        ans[i - j] += ans[i - j - 1];
      }
    }

    // Convert the Integer array to a List and return the row of Pascal's Triangle.
    return Arrays.asList(ans);
  }
}
