class Solution {
    public int integerBreak(int n) {
        
        
        // base cases 
        
        if(n == 2){
            return 1 ;
        }
        
        if(n == 3){
            return 2 ;
        }

      //  Initialize the result variable to store the maximum product  
      int result = 1;  
        
        // Continue breaking down n into factors of 3 until n is greater than 4
        
        while( n > 4){
            // Multiply the result by 3, effectively breaking down n into a factor of 3
            result *= 3;
            n -=3;
        }
        
              
        // At this point, n is either 2, 3, or 4. Multiply the remaining n with the result.
        // This handles the remaining part of the integer break.  
         return result * n  ;
        
    }
}