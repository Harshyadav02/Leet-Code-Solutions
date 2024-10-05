class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        s1 = new String(ch); 
        int s2Length = s2.length();
        int s1Length = s1.length();

        for (int start = 0; start <= s2Length - s1Length; start++) {
            String subString = s2.substring(start, start + s1Length);
            ch = subString.toCharArray();
            Arrays.sort(ch); 
            subString = new String(ch); 

            if (subString.equals(s1)) {
                return true;
            }
        }
        return false;
    }
}
