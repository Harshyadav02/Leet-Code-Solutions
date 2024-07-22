class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele : nums){

            pq.add(ele);
        }

        while(pq.size() !=k){
            pq.poll();
        }

        return pq.poll();
    }
}



