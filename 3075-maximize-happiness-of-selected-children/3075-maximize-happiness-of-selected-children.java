class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        
        Arrays.sort(happiness);

        long maximumSumOfHappiness = 0;

        int tracker = 0;

        for(int child=happiness.length-1; child >=0; child--){
            if(k==0){
                break;
            }
            if(happiness[child]-tracker>=0)
                {
                maximumSumOfHappiness+=happiness[child]-tracker;
                k--;
                tracker++;
                }
            else{
                break;
            }
        }

        return maximumSumOfHappiness;
    }
}