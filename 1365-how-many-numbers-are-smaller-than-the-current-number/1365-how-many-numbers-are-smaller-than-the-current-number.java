class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int sortedArray[] =  nums.clone();
        int length = nums.length;
        Arrays.sort(sortedArray);
        
        for(int index=length-1; index>=0; index--){

           map.put(sortedArray[index] , index);
        }

        for(int index=0; index<length; index++){
            nums[index] = map.get(nums[index]);
        }
        return nums;
    }
}