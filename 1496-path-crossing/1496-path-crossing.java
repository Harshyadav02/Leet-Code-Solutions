
public class Solution {
    public boolean isPathCrossing(String path) {
        // Initialize variables to represent the current direction
        int xDirection = 0, yDirection = 0;

        // Create a set to store visited points
        Set<String> visited = new HashSet<>();

        // Mark the starting point as visited
        visited.add(xDirection + "," + yDirection);

        // Iterate through each character in the path
        for (char direction : path.toCharArray()) {
            // Update the current direction based on the character
            if (direction == 'N') {
                yDirection += 1;
            } else if (direction == 'S') {
                yDirection -= 1;
            } else if (direction == 'E') {
                xDirection += 1;
            } else if (direction == 'W') {
                xDirection -= 1;
            }

            // Check if the current position has been visited before
            String currentPosition = xDirection + "," + yDirection;
            if (visited.contains(currentPosition)) {
                // If visited, return true (path crosses itself)
                return true;
            }

            // Add the current position to the set of visited points
            visited.add(currentPosition);
        }

        // If no crossing is found, return false
        return false;
    } 
}
