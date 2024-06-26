class Solution {
    public int minimumOperations(int[] nums) {
        
        int operations = 0;
        for(int ele: nums){
            if(ele%3!=0){
                operations +=1;
            }
        }
        return operations;
    }
}