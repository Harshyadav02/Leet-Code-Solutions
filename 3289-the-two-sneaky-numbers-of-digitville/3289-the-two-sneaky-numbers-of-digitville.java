class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int twoSneakyNumbers[] = new int[2];
        Map<Integer,Integer> map = new HashMap<>();

        for(int ele:nums){

            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        int i=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            if(entry.getValue()>1){

                twoSneakyNumbers[i++] = entry.getKey();
            }
        }

        return twoSneakyNumbers;
    }
}