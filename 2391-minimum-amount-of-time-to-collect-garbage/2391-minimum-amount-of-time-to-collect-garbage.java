class Solution {

    // Method to calculate the minimum time needed for garbage collection
    public int garbageCollection(String[] garbage, int[] travel) {
        
        // Initialize variables to track time for each type of garbage and total time
        int plasticTime = 0, metalTime = 0, glassTime = 0, totalTime = 0;

        // Calculate cumulative travel time
        for (int timeTaken = 1; timeTaken < travel.length; timeTaken++) {
            travel[timeTaken] = travel[timeTaken - 1] + travel[timeTaken];
        }

        // Variables to store the last occurrence of each type of garbage
        int lastOccurrenceOfPlastic = -1, lastOccurrenceOfMetal = -1, lastOccurrenceOfGlass = -1;
        
        // Iterate through each house
        for (int houseNumber = 0; houseNumber < garbage.length; houseNumber++) {

            // Get the type of garbage at the current house
            String typeOfGarbage = garbage[houseNumber];

            // Update the last occurrence index for each type of garbage
            if (typeOfGarbage.contains("G")) {
                lastOccurrenceOfGlass = houseNumber;
            }

            if (typeOfGarbage.contains("P")) {
                lastOccurrenceOfPlastic = houseNumber;
            }

            if (typeOfGarbage.contains("M")) {
                lastOccurrenceOfMetal = houseNumber;
            }
            
            // Add the time to pick up the garbage at the current house to the total time
            totalTime += typeOfGarbage.length();
        }

        // Add additional travel time if there are last occurrences for each type of garbage
        if (lastOccurrenceOfGlass > 0 && lastOccurrenceOfGlass != 0) {
            totalTime += travel[lastOccurrenceOfGlass - 1];
        }

        if (lastOccurrenceOfMetal > 0 && lastOccurrenceOfMetal != 0) {
            totalTime += travel[lastOccurrenceOfMetal - 1];
        }

        if (lastOccurrenceOfPlastic > 0 && lastOccurrenceOfPlastic != 0) {
            totalTime += travel[lastOccurrenceOfPlastic - 1];
        }

        return totalTime;
    }
}
