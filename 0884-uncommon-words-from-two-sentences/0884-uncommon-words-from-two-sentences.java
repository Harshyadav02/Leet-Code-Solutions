class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        Map<String,Integer> map = new HashMap<>();
        s1 += " "+s2; 
        String s1Array[] = s1.split("\\s+");
        ArrayList<String> list = new ArrayList<>();

        for(String word:s1Array ){

            map.put(word,map.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){

            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }

        return list.toArray(new String[0]);
        
    }
}