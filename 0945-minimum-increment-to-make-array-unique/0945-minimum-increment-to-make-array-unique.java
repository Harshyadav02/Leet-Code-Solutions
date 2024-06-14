class Solution {
    public int minIncrementForUnique(int[] nums) {
        
        int minimumMoves = 0;
        Arrays.sort(nums);
        for(int index=1; index<nums.length; index++){

            if(nums[index]<= nums[index-1]){

                minimumMoves += (nums[index-1] - nums[index])+1;
                nums[index] += (nums[index-1] - nums[index])+1;
            }
        }
        return minimumMoves;
    }
}