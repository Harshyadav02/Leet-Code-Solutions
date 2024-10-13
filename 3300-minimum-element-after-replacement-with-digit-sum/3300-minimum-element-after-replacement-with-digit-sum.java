class Solution {
    public int minElement(int[] nums) {
        
        for (int index = 0; index < nums.length; index++) {
            nums[index] = calSumOfDigit(nums[index]);
        }
        return Arrays.stream(nums).min().orElse(Integer.MAX_VALUE);
        
    }         

    private int calSumOfDigit(int number) {
        int result = 0;
        
       
        while (number > 0) {
            int rem = number % 10;
            result += rem;
            number = number / 10;
        }
        
        return result; 
    }
}
