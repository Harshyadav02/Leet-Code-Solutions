class Solution {
    public String reversePrefix(String word, char ch) {
        
        StringBuilder sb = new StringBuilder();
        int ch_index=-1;
        for(int index=0;index<word.length(); index++){

            if(word.charAt(index)==ch){
                ch_index=index;
                break;
            }
        }

        if(ch_index !=-1){

            // StringBuilder helper = new StringBuilder();
            sb.append(word.substring(0,ch_index+1));
            sb.reverse();
            sb.append(word.substring(ch_index+1,word.length()));
            word = sb.toString();
            
        }

        return word;

        
    }
}