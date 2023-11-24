class Solution {
    public int maxCoins(int[] piles) {
       
        // Initialize three pointers: left, middle, and right to trak the elements of array
        int left = 0, middle = piles.length -2 , right = piles.length -1;
        
        // total number of coins we will have at the end
        int coins = 0; 
        
        
        Arrays.sort(piles) ;
    // Traverse the array until the left pointer crosses the middle pointer
        while(left < middle ){

    // Collect coins from the rightmost pile
        coins += piles[middle];
        // Update the middle and right pointers to the next two piles
        right = middle-1 ;
        middle = right-1;
        
        
        left ++ ;       

        }
        return coins ;
    }
}