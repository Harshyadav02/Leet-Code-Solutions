
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();

        // Adding all the array values to the ArrayList
        for (int i : nums) {
            list.add(i);
        }

      
        // Converting ArrayList to HashMap
        for (int key : list) {
            // If key is present already, increase the value by 1
            if (hash.containsKey(key)) {
                hash.put(key, hash.get(key) + 1);
            } else {
                hash.put(key, 1);
            }
        }

        ArrayList<Integer> majorityElements = new ArrayList<>();
        int threshold = nums.length / 3;

        // Finding and adding majority elements to the result ArrayList
        for (int key : hash.keySet()) {
            if (hash.get(key) > threshold) {
                majorityElements.add(key);
            }
        }

        return majorityElements;
    }
}
