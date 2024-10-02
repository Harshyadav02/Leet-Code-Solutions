class Solution {
  public int[] arrayRankTransform(int[] arr) {
    int[] sortedArray = arr.clone();
    Map<Integer, Integer> rank = new HashMap<>();

    Arrays.sort(sortedArray);

    for (final int a : sortedArray)
      rank.putIfAbsent(a, rank.size() + 1);

    for (int i = 0; i < arr.length; ++i)
      arr[i] = rank.get(arr[i]);

    return arr;
  }
}