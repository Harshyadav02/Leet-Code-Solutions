class Solution {
    public int arrangeCoins(int n) {
        int row = 1;
        int totalCompleateRow =0;
        while(true){

            if(n-row>=0){
                totalCompleateRow++;
                n = n-row++;
            }else{
                break;
            }
        }

        return totalCompleateRow;
    }
}