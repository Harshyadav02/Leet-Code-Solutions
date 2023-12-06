class Solution {
    public int totalMoney(int n) {
        // Initialize variables to keep track of total money, number of Mondays, and total days
        int totalMoney = 0;
        int numberOfMondays = 0;
        int totalDays = 1;

        // Loop through each day from 1 to n
        for(int days = 1; days <= n; days++){
            // Accumulate total money with the current total days
            totalMoney += totalDays;
            // Increment total days for the next iteration
            totalDays++;

            // Check if a week (7 days) has passed
            if( days % 7 == 0 ){
                // If it's a Monday, increment the number of Mondays
                numberOfMondays++;
                // Reset total days to the current Monday's value for the next week
                totalDays = numberOfMondays + 1;
            }
        }

        // Return the total accumulated money
        return totalMoney;
    }
}
