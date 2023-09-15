class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int low = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (map.containsKey(curr)) {
                low = Math.max(low, map.get(curr) + 1);
            }
            map.put(curr, i);
            max = Math.max(max, i - low + 1);
        }
        return max;
    }
}