class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int ele = 0 ; ele < nums.length; ele++) {

            nums[ele] = square(nums[ele]);
        }
        Arrays.sort(nums) ;
        return nums ;
    }

    private int square(int number) {

        return number * number ;
    }
}