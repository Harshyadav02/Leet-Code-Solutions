class Solution {
    public int findTheWinner(int n, int k) {
        // Create a list to hold the friends
        List<Integer> friendsList = new ArrayList<>();
        
        // Populate the list with friends numbered from 1 to n
        for (int i = 1; i <= n; i++) {
            friendsList.add(i);
        }
        
        // Initialize the index to start removing elements from
        int index = 0;
        
        // Loop until only one friend is left in the list
        while (friendsList.size() > 1) {
            // Calculate the next index to remove, considering the circular nature of the list
            index = (index + (k - 1)) % friendsList.size();
            // Remove the friend at the calculated index
            friendsList.remove(index);
        }
        
        // Return the last remaining friend
        return friendsList.get(0);
    }
}
