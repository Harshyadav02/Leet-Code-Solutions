class Solution {
  public int[][] largestLocal(int[][] grid) {
    final int n = grid.length;
    int[][] maxLocal = new int[n - 2][n - 2];

    for (int i = 0; i < n - 2; ++i)
      for (int j = 0; j < n - 2; ++j)
        for (int x = i; x < i + 3; ++x)
          for (int y = j; y < j + 3; ++y)
            maxLocal[i][j] = Math.max(maxLocal[i][j], grid[x][y]);

    return maxLocal;
  }
}