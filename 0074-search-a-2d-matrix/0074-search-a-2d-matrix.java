public class Solution {

    // Binary search method
    public boolean binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == target) {
                return true;
            }
            if (array[mid] > target) {
                end = mid - 1;
            }
            if (array[mid] < target) {
                start = mid + 1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        // Iterate through each row in the matrix
        for (int[] row : matrix) {

            // Check if target is either the first or last element in the current row
            if (row[0] == target || row[row.length - 1] == target) {
                return true;
            }

            // Check if target lies within the range of values in the current row
            else if (target > row[0] && target < row[row.length - 1]) {

                // If yes, perform binary search in the current row
                boolean result = binarySearch(row, target);
                if (result) {
                    return true;
                }
            }
        }
        return false;
    }
}
