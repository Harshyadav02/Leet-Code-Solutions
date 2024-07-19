class Solution {
       public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minRow = Integer.MAX_VALUE;
            int colIndex = -1;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    colIndex = j;
                }
            }

            boolean isMaxInColumn = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][colIndex] > minRow) {
                    isMaxInColumn = false;
                    break;
                }
            }

            if (isMaxInColumn) {
                luckyNumbers.add(minRow);
            }
        }

        return luckyNumbers;
    }
}