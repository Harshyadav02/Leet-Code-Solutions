class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        Arrays.stream(nums).forEach(num -> freqMap.put(num, freqMap.getOrDefault(num, 0) + 1));
        
        for (int num : freqMap.keySet()) {
            if (freqMap.get(num) == 1) {
                return num;
            }
        }
        
        return -1;
    }
}