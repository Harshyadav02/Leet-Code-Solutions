class Solution {
    public String stringHash(String s, int k) {
        StringBuilder result = new StringBuilder(); 
        int n = s.length(); 

        int start = 0;  
        int end = k;  

        while (end <= n) {
            String substring = s.substring(start, end); 
            result.append(returnNewString(substring));  

            start = end;
            end += k;
        }

        return result.toString();  
    }
    private String returnNewString(String substring) {
        int sum = 0; 
        for (int index = 0; index < substring.length(); index++) {
            sum += substring.charAt(index) - 'a';  
        }

        char newChar = (char) ('a' + sum % 26);

        return String.valueOf(newChar);
    }
}
