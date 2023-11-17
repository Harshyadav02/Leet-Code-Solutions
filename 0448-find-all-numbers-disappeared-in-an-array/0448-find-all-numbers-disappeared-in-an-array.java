class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Create a list to store the missing numbers
        ArrayList<Integer> list = new ArrayList<>();

        // Create an array to mark the presence of each number
        int arr[] = new int[nums.length];

        // Mark the presence of each number in the array
        for (int i = 0; i < nums.length; i++) {
            // Mark the presence of nums[i] by assigning nums[i] to arr[nums[i] - 1]
            arr[nums[i] - 1] = nums[i];
        }

        // Iterate through the marked array to find missing numbers
        for (int i = 0; i < arr.length; i++) {
            // If arr[i] is still 0, then the number (i+1) is missing
            if (arr[i] == 0) {
                // Add the missing number to the list
                list.add(i + 1);
            }
        }

        // Return the list of missing numbers
        return list;
    }
}
