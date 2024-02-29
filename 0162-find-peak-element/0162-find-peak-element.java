class Solution {
    public int findPeakElement(int[] nums) {
        

        if (nums.length == 1 )return 0 ;
        for(int ele = 1 ; ele < nums.length ; ele++){

            if(nums[ele -1] > nums[ele]) return ele -1 ;
        }
        return nums.length-1 ;
    }
}