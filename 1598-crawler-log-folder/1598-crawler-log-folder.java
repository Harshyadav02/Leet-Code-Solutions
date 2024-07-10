public class Solution {
    public int minOperations(String[] logs) {
        // A variable to keep track of the moves
        int steps = 0;

        // Iterate through each operation in the logs
        for (String operation : logs) {
            // If the operation is to move to the parent folder ("../")
            if (operation.equals("../")) {
                // Decrement the steps variable by 1 if it's greater than 0
                steps -= (steps > 0) ? 1 : 0;
            }
            // If the operation is to remain in the same folder ("./"), do nothing
            else if (operation.equals("./")) {
                // Do nothing
            }
            // If the operation is to move to a child folder ("x/"), increment the steps variable by 1
            else {
                steps++;
            }
        }
        // Return the final value of the steps variable, representing the minimum number of operations
        return steps;
    }
}
