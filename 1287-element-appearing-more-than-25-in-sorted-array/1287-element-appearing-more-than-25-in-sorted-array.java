class Solution {
    public int findSpecialInteger(int[] arr) {
        
        // Create a HashMap to store the frequency of each element in the array
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array to populate the HashMap
        for (int element = 0; element < arr.length; element++) {
            // Check if the element is already in the map
            if (map.containsKey(arr[element])) {
                // If yes, increment its frequency
                map.put(arr[element], map.get(arr[element]) + 1);
            } else {
                // If not, add the element to the map with a frequency of 1
                map.put(arr[element], 1);
            }
        }

        // Calculate the threshold frequency that an element must surpass
        int elementMoreThan25Percent = (arr.length * 25) / 100;

        // Iterate through the keys (unique elements) in the map
        for (Integer key : map.keySet()) {
            // Check if the frequency of the current element is greater than 25% of the array length
            if (map.get(key) > elementMoreThan25Percent) {
                // If yes, return the special integer that appears more than 25% of the time
                return key;
            }
        }

        // If no special integer is found, return -1
        return -1;
    }
}
