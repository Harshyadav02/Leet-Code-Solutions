class Solution {
    public String reverseWords(String s) {
        
         
	    
	    String new_string = "";
	    String[] parts = s.split(" ");
	   
	   
	   // System.out.println(Arrays.toString(parts));
	    
	   for(int i = parts.length-1; i>=0; i--){
           if (parts[i].equals(""))continue;
           else{
               new_string += parts[i] + " ";
           }
	       
	   } 
	   return new_string.trim() ;
    }
}