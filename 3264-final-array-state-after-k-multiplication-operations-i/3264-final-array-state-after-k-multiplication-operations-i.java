class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        List<Integer> list = (Arrays.stream(nums).boxed().collect(Collectors.toList()));

        for(int i=1; i<=k; i++){

            int minEle = Collections.min(list);
            int indexOfMin = list.indexOf(minEle);
            minEle =  minEle*multiplier;
            list.set(indexOfMin,minEle);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}