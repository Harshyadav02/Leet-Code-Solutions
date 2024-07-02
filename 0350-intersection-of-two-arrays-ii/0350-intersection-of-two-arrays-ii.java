class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> counter = new HashMap<>();

        // Count the occurrences of each number in nums1
        for (int num : nums1) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        // Find the intersection
        for (int num : nums2) {
            if (counter.containsKey(num) && counter.get(num) > 0) {
                result.add(num);
                counter.put(num, counter.get(num) - 1);
            }
        }

        // Convert the result list to an array
        int[] intersectArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersectArray[i] = result.get(i);
        }

        return intersectArray;
    }
}
