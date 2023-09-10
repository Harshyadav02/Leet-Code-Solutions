

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> majorityElements = new ArrayList<>();
        HashMap<Integer, Integer> counts = new HashMap<>();

        int threshold = nums.length / 3;

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (int key : counts.keySet()) {
            if (counts.get(key) > threshold) {
                majorityElements.add(key);
            }
        }

        return majorityElements;
    }
}
