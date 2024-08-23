class Solution {
    public int returnToBoundaryCount(int[] nums) {
        
        int boundaryCount = 0;
        int boundary = 0;

        for(int index=0;index<nums.length; index++){

            boundary += nums[index];
            if(boundary==0){
                boundaryCount++;
            }
        }
        return boundaryCount;
    }
}