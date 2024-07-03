class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);

        if(nums.length<=3){
            return 0;
        }
        
        //case 1 remove last 3 element
        int case1Answer = nums[nums.length-1-3]-nums[0];

        //case 2 remove first 3 element
        int case2Answer = nums[nums.length-1]-nums[3];

        //case 3 remove last 2 elment and remove 1st element

        int case3Answer = nums[nums.length-1 -2] - nums[1];
        
        //case 4 remove last 1 elment and remove first 2 element

        int case4Answer = nums[nums.length-1 -1] - nums[2];

        return Math.min(Math.min(case1Answer,case2Answer),Math.min(case3Answer,case4Answer));
        
    }
}