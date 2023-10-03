class Solution {
    public boolean winnerOfGame(String colors) {
        
        
        HashMap <Character , Integer > map = new HashMap<>();
        
        map.put('A' ,0);
        map.put('B' ,0);

        // if the string contains only 2 value then Alice will always lose (According to question Alice is the first who start playing first)
        if (colors.length() == 2) return false ;

        // couting the number of truns alice got 
        for(int i = 1; i<colors.length()-1; i++){
            if(colors.charAt(i) == 'A'){
                
                if(colors.charAt(i) == colors.charAt(i-1) && colors.charAt(i) == colors.charAt(i+1)){
                  
                    map.put('A' , map.get('A') +1);
                } 
            }
                
             // couting the number of turns bob got 
            else if(colors.charAt(i) == 'B'){
                
                if(colors.charAt(i) == colors.charAt(i-1) && colors.charAt(i) == colors.charAt(i+1)){
                  
                    map.put('B' , map.get('B') +1);
                } 
            }
        }
        
        // retving the number of turns Alice and Bob got
        int Alice = map.get('A');
        int Bob = map.get('B');


        // if Alice have higher number of turns Alice wins else Bob bob wins
        if(Alice > Bob){
            return true;
        }
        
        return false;
    }
}
