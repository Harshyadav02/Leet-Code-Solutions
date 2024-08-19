class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int kConstraints = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int countOnes = 0;
            int countZeros = 0;
            
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    countOnes++;
                } else {
                    countZeros++;
                }

                if (countOnes <= k || countZeros <= k) {
                    kConstraints += 1;
                }
            }
        }
        
        return kConstraints;
    }
}
