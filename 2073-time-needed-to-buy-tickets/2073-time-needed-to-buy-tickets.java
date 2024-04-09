// class Solution {
//     public int timeRequiredToBuy(int[] tickets, int k) {
//         int n = tickets.length;
//         int timeTaken = 0;
//         int[] remainingTickets = Arrays.copyOf(tickets, n);

//         while (remainingTickets[k] > 0) {
//             for (int i = 0; i < n && remainingTickets[k] > 0; i++) {
//                 if (remainingTickets[i] > 0) {
//                     timeTaken++;
//                     remainingTickets[i]--; 
//                 }
//             }
//         }

//         return timeTaken;
//     }
// }

/* Optimaized approch*/

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int timeTaken = 0 ;
        for(int index=0; index<tickets.length; index++){

            if(index<= k){
                
                timeTaken += Math.min(tickets[index], tickets[k]);
            }
            else{
                timeTaken += Math.min(tickets[index], tickets[k]-1);
            
            }
        }
        return timeTaken ;
    }

}