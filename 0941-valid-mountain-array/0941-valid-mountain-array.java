class Solution {
    public boolean validMountainArray(int[] arr) {
        
        // Find the index of the maximum element in the array
        int maxIndex = 0;
        // Flag to store the final answer
        boolean final_answer = true;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
                // Uncomment the following line to see the index of the peak element
                // System.out.println(maxIndex);
            }
        }
        
        // Create two arrays representing the two parts of the mountain
        int part1[] = Arrays.copyOfRange(arr, 0, maxIndex);
        int part2[] = Arrays.copyOfRange(arr, maxIndex, arr.length);
        
        // Check if any of the parts is empty or if the array length is less than 3
        if (part1.length == 0 || part2.length == 0 || part2.length == 1) {
            return false;
        }
        if (arr.length < 3) {
            return false;
        }
       
        // Check if the first part is strictly increasing
        for (int i = 0; i < part1.length - 1; i++) {
            if (part1[i] < part1[i + 1]) {
                continue;
            } else {
                final_answer = false;
            }
        }

        // Check if the second part is strictly decreasing
        for (int i = 0; i < part2.length - 1; i++) {
            if (part2[i] > part2[i + 1]) {
                continue;
            } else {
                final_answer = false;
            }
        }   

        return final_answer;   
    }
}   
