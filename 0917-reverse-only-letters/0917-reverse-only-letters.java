
class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();
        List<Integer> nonLetterPositions = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else {
                nonLetterPositions.add(i);
            }
        }
        
        
        sb.reverse();
        
        for (int pos : nonLetterPositions) {
            sb.insert(pos, s.charAt(pos));
        }
        
        return sb.toString();
    }
}
