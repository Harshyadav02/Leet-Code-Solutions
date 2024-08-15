class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveRs=0;
        int tenRs=0;
        if(bills[0]>5){
            return false;
        }
        for(int cost=0; cost<bills.length; cost++){

            if(bills[cost]==5){
                fiveRs++;
            }
            else if(bills[cost]==10){
                if(fiveRs>0){
                    fiveRs--;
                    tenRs++;
                }else {
                    return false;
                }
            }
            else{
                if(fiveRs>0 && tenRs>0){
                    fiveRs--;
                    tenRs--;
                }else if(fiveRs>=3) fiveRs -=3;
                else return false;
            }
        }

        return true;
    }
}