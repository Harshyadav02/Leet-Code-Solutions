class Solution {
    // This method finds the destination city given a list of paths.
    public static String destCity(List<List<String>> paths) {
        
        // Create a HashMap to store the relationships between cities.
        HashMap<String, String> map = new HashMap<>();

        // Iterate through each path in the list.
        for (int index = 0; index < paths.size(); index++) {
            // Iterate through each city in the current path (except the last one).
            for (int city = 0; city < paths.get(index).size() - 1; city++) {
                // Map the current city to its destination city in the HashMap.
                map.put(paths.get(index).get(city), paths.get(index).get(city + 1));
            }
        }

        // Iterate through the values in the HashMap.
        for (String value : map.values()) {
            // Check if the destination city is not present as a key in the HashMap.
            if (!map.containsKey(value)) {
                // If not present, return the destination city.
                return value;
            }
        }

        // If no match is found, return null or some default value.
        return null;
    }
}
