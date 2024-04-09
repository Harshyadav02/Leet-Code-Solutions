class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int timeTaken = 0;
        int[] remainingTickets = Arrays.copyOf(tickets, n);

        while (remainingTickets[k] > 0) {
            for (int i = 0; i < n && remainingTickets[k] > 0; i++) {
                if (remainingTickets[i] > 0) {
                    timeTaken++;
                    remainingTickets[i]--; 
                }
            }
        }

        return timeTaken;
    }
}