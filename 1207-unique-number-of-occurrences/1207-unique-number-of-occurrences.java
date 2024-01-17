class Solution {
    // Method to check if the occurrences of each element in the array are unique
    public boolean uniqueOccurrences(int[] arr) {
        
        // HashMap to store the count of occurrences for each element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array and populate the HashMap
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        // Create a HashSet from the values of the HashMap to check uniqueness
        HashSet<Integer> getValues = new HashSet<>(map.values());

        // If the size of the HashSet is less than the size of the HashMap, 
        // it means there are duplicate occurrences, so return false
        if (getValues.size() < map.size()) {
            return false;
        }

        // If the size of the HashSet is equal to the size of the HashMap,
        // it means all occurrences are unique, so return true
        return true;
    }
}
