class Solution {
    public int reverse(int x) {
        
        long reversed_number = 0;
        
        while(x != 0){
            
            long reminder = x % 10 ;
            
            reversed_number = reversed_number * 10 + reminder ;
            
            x = x/10;
        }
        
        if( (reversed_number <= Math.pow(2,31)-1) && (reversed_number >= Math.pow(-2 , 31)))return (int)reversed_number;
        
        return 0;
    }
}