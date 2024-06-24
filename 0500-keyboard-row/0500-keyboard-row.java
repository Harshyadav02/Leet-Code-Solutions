class Solution {
    public String[] findWords(String[] words) {
        
        String line1 = "qwertyuiop";
        String line2 = "asdfghjkl";
        String line3 = "zxcvbnm";
        ArrayList<String> list = new ArrayList<>();
        
        for (String str: words) {
            int i;
            for (i = 1; i < str.length(); i++) {
                char firstChar = Character.toLowerCase(str.charAt(0));
                char currentChar = Character.toLowerCase(str.charAt(i));
                
                if (line1.contains(String.valueOf(firstChar))) {
                    if (!line1.contains(String.valueOf(currentChar))) {
                        break;
                    }
                } else if (line2.contains(String.valueOf(firstChar))) {
                    if (!line2.contains(String.valueOf(currentChar))) {
                        break;
                    }
                } else if (line3.contains(String.valueOf(firstChar))) {
                    if (!line3.contains(String.valueOf(currentChar))) {
                        break;
                    }
                }
            }
            if (i == str.length()) {  
                list.add(str);
            }
        }
        
        return list.toArray(new String[0]);
    }
}
