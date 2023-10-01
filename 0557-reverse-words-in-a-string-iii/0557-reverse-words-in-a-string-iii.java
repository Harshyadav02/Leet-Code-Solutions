class Solution {
    public String reverseWords(String s) {
        
        
        String array [] = s.split(" ");
        
        String helper_string_1 = "";
        
        for(int i= 0; i<array.length ; i++){
            
            String helper_string_2 = array[i];
            
            for(int j = helper_string_2.length()-1 ; j>=0; j--){
                
                helper_string_1 += helper_string_2.charAt(j);
                
            }
            
            if(i < array.length -1){
                helper_string_1 += " ";
            }
        }
        
        return helper_string_1;
    }
}


