class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap <Character , Integer> map = new HashMap<>();
        
        
        // inserting all the s elements to map with number of frequency
        for(int i = 0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            map.put(ch , map.getOrDefault(ch, 0) + 1);
            
        }
        
        // iteration for t string 
        for(int i= 0; i <t.length(); i++){
            
            char ch = t.charAt(i);
            
            if(map.get(ch)!=null){
                
                
                // if the value for the character  of t is 1 then remove it 
                if(map.get(ch) == 1){
                    map.remove(ch);
                } 
                else{
                    
                    // if the value for the key is  greater then 1 then decrese it by 1
                    map.put(ch , map.get(ch) -1);
                }
            } 
            else{
                return false ;
            }
        }
        
        
        return map.isEmpty();
    }
}