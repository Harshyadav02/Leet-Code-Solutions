class Solution {
    public int thirdMax(int[] nums) {
        int length = nums.length-1;
        Arrays.sort(nums);
        int counter=0;
        for(int i=length;i>0;i--){
            if(nums[i]!=nums[i-1]){
                counter++;
            }
            if(counter==2){
                return nums[i-1];
            }
        }
        return nums[length];
    }
}