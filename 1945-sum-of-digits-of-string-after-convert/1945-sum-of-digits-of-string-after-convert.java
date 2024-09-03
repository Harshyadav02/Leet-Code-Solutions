class Solution {
    public int getLucky(String s, int k) {
        StringBuilder transformation = new StringBuilder();
        
        for (char character : s.toCharArray()) {
            int alphabetNo = character - 'a' + 1;
            transformation.append(alphabetNo);
        }
        
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < transformation.length(); j++) {
                sum += Character.getNumericValue(transformation.charAt(j));
            }
            transformation.setLength(0);  
            transformation.append(sum);   
        }
        
        return Integer.parseInt(transformation.toString());
    }
}
