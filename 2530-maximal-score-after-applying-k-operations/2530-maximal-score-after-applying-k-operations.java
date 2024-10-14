class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(Arrays.stream(nums).boxed().toList());
        long result = 0;
        while(k>0){

            int maxEle = maxHeap.poll();
            result += maxEle;
            maxHeap.add((int) Math.ceil(maxEle / 3.0));
            k--;
        }
        return result;
    }
}