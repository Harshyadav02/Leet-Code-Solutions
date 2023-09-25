class Solution {
    public char findTheDifference(String s, String t) {
        
        int s_sum = 0;
        int t_sum = 0;
        for(int i =0; i<s.length() ; i++){
            
            s_sum += (int)s.charAt(i); 
        }
         for(int i =0; i<t.length() ; i++){
            
            t_sum += (int)t.charAt(i); 
        }
        
       int diff = t_sum - s_sum ;
    //    char result = char(diff)
        return (char)(diff);
    }
}