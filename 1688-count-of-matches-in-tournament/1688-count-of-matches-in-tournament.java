class Solution {
    // Function to calculate the number of matches played
    public int numberOfMatches(int n) {
        // Variable to store the total number of matches played
        int matchesPlayed = 0;
        // Variable to track the number of teams advancing to the next round
        int teamsAdvanceToTheNextRound = n;

        // Continue the loop until only one team is left
        while (teamsAdvanceToTheNextRound != 1) {
            // Check if the number of teams is even
            if (teamsAdvanceToTheNextRound % 2 == 0) {
                // If even, add half of the teams to matches played
                matchesPlayed += teamsAdvanceToTheNextRound / 2;
                // Update the number of teams advancing to the next round
                teamsAdvanceToTheNextRound = teamsAdvanceToTheNextRound / 2;
            } else {
                // If odd, add (teams - 1) / 2 to matches played
                matchesPlayed += (teamsAdvanceToTheNextRound - 1) / 2;
                // Update the number of teams advancing to the next round, considering the extra team
                teamsAdvanceToTheNextRound = (teamsAdvanceToTheNextRound - 1) / 2 + 1;
            }
        }

        // Return the total number of matches played
        return matchesPlayed;
    }
}
