class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> messageList = Arrays.stream(bannedWords).collect(Collectors.toSet());
        // List<String> messageList = Arrays.asList(bannedWords);
        int count = 0;
        
        for(String word : message){
            
            if(messageList.contains(word)){
                count++;
            }
        }
        
        return count>=2 ? true:false;
    }
}