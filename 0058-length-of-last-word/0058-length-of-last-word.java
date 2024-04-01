class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim() ;

        String stringArray[] = s.split("\\s+");

        String lastWord = stringArray[stringArray.length-1] ;

        return lastWord.length() ;
    }
}