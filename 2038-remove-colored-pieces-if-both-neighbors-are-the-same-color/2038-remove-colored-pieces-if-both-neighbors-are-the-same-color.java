class Solution {
    public boolean winnerOfGame(String colors) {
        
        
        HashMap <Character , Integer > map = new HashMap<>();
        
        map.put('A' ,0);
        map.put('B' ,0);
        
        if (colors.length() == 2) return false ;
        
        for(int i = 1; i<colors.length()-1; i++){
            if(colors.charAt(i) == 'A'){
                
                if(colors.charAt(i) == colors.charAt(i-1) && colors.charAt(i) == colors.charAt(i+1)){
                  
                    map.put('A' , map.get('A') +1);
                } 
            }
            
            else if(colors.charAt(i) == 'B'){
                
                if(colors.charAt(i) == colors.charAt(i-1) && colors.charAt(i) == colors.charAt(i+1)){
                  
                    map.put('B' , map.get('B') +1);
                } 
            }
        }
        
        int Alice = map.get('A');
        int Bob = map.get('B');
        
        if(Alice > Bob){
            return true;
        }
        
        return false;
    }
}