
class Solution {
    // Method to calculate the average salary excluding the minimum and maximum values
    public double average(int[] salary) {
        // Sort the array in ascending order
        Arrays.sort(salary);

        // Variables to store the sum of salaries and count of included salaries
        double sumOfSalary = 0;
        double count = 0;

        // Check if there are more than two elements in the array
        if (salary.length > 2) {
            
            // Iterate through the sorted array excluding the minimum and maximum values
            for (int i = 1; i < salary.length - 1; i++) {
                
                // Add the current salary to the sum
                sumOfSalary += salary[i];
                // Increment the count of included salaries
                count++;
            }
        }

        // Calculate and return the average salary
        return sumOfSalary / count;
    }
}
