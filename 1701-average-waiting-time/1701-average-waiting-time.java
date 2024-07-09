class Solution {
    public double averageWaitingTime(int[][] customers) {
        // total waiting time and current time
        double waitingTime = 0;
        int currentTime = 0;

        // Iterate through each customer in the array
        for (int[] customer : customers) {
            // Unpack arrival time and time needed for the current customer
            int arrivalTime = customer[0];
            int timeNeeded = customer[1];

            // If the chef is idle until this customer arrives, update currentTime to the customer's arrival time
            if (arrivalTime > currentTime) {
                currentTime = arrivalTime;
            }

            // time when the chef will finish the current order
            int servedTime = currentTime + timeNeeded;

            // waiting time for the current customer and add it to the total waiting time
            waitingTime += servedTime - arrivalTime;

            // Update the current time to the served time
            currentTime = servedTime;
        }

        // Calculate and return the average waiting time
        return waitingTime / customers.length;
    }
}
