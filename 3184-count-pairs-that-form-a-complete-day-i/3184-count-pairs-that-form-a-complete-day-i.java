class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int completeDaycount = 0;

        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                int totalHours = hours[i] + hours[j];
                
                if (totalHours % 24 == 0) {
                    completeDaycount++;
                }
            }
        }
        
        return completeDaycount;
    }
}
