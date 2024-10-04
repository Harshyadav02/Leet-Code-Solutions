class Solution {
    public long dividePlayers(int[] skill) {
       
        Arrays.sort(skill);
        
        int start = 0, end = skill.length - 1;
        long totalSum = 0;
        int expectedSum = skill[start] + skill[end];

        while (start < end) {
            if (skill[start] + skill[end] != expectedSum) {
                return -1;
            }
            totalSum += (long) skill[start++] * skill[end--];
          
        }

        return totalSum;
    }
}
