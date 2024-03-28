import java.util.HashMap;

class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        // Create a HashMap to store the indices of numbers in the original array
        HashMap<Integer, Integer> numsHashMap = new HashMap<>();
        
        // Populate the HashMap with numbers as keys and their indices as values
        for (int index = 0; index < nums.length; index++) {
            numsHashMap.put(nums[index], index);
        }
        
        // Iterate through the operations array
        for (int array[] : operations) {
            // Extract the original and replacing values from the current operation
            int originalValue = array[0];
            int replacingValue = array[1];
            
            // Find the index of the original value in the original array using the HashMap
            int index = numsHashMap.get(originalValue);
            
            // Replace the value at the found index with the replacing value
            nums[index] = replacingValue;
            
            // Update the HashMap: remove the original value and add the replacing value with its index
            numsHashMap.put(replacingValue, numsHashMap.remove(originalValue));
        }
        
        // Return the modified array
        return nums;
    }
}
