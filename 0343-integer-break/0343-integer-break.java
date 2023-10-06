class Solution {
    public int integerBreak(int n) {
        
        
        // base cases 
        
        if(n == 2){
            return 1 ;
        }
        
        if(n == 3){
            return 2 ;
        }
        
      int result = 1;  
      while( n > 4){
          
          result *= 3;
          n -=3;
      }
        
      return result * n  ;
        
    }
}