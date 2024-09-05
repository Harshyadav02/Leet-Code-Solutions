class Solution {
    public int countEven(int num) {
        int evenCount =0;
        for(int i=1;i<=num; i++){
            
            if(calSum(i)%2==0) evenCount ++;
        }
        return evenCount;
    }
    private int calSum(int digit){

        int sum = 0;
        while(digit>0){
            sum += digit%10;
            digit /= 10;
        }
            
        return sum;
    }
}