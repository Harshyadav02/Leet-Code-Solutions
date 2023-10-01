class Solution {
    public String reverseWords(String s) {
        
        // Splitting the string on the basis of white spaces
        
        String array [] = s.split(" ");
        
        
        // helper string which will contain final string
        String helper_string_1 = "";
        
        
        for(int i= 0; i<array.length ; i++){
            
            String helper_string_2 = array[i];
            
            // traversing to the string from backward
            for(int j = helper_string_2.length()-1 ; j>=0; j--){
                
                helper_string_1 += helper_string_2.charAt(j);
                
            }
            
            // adding white spaces after each word
            if(i < array.length -1){
                helper_string_1 += " ";
            }
        }
        
        return helper_string_1;
    }
}


