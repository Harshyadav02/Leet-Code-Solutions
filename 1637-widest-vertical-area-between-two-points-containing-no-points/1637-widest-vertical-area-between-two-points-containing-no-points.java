class Solution {

    // Method to find the maximum width of vertical area
    public int maxWidthOfVerticalArea(int[][] points) {

        // Variable to store the maximum width
        int maximumWidth = 0;

        // Array to store x-coordinates of points
        int xCoordinate[] = new int[points.length];

        // Extract x-coordinates from the given points array
        for (int xValue = 0; xValue < points.length; xValue++) {
            xCoordinate[xValue] = points[xValue][0];
        }

        // Sort the x-coordinates in ascending order
        Arrays.sort(xCoordinate);

        // Iterate through the sorted x-coordinates to find the maximum width
        for (int index = 1; index < xCoordinate.length; index++) {
            // Calculate the difference between consecutive x-coordinates
            int currentWidth = xCoordinate[index] - xCoordinate[index - 1];

            // Update the maximumWidth if the currentWidth is greater
            maximumWidth = Math.max(maximumWidth, currentWidth);
        }

        // Return the maximum width of vertical area
        return maximumWidth;
    }
}
