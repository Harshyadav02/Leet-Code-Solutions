class Solution {
    public int sumOfMultiples(int n) {
        
        // ArrayList<Integer> list = new ArrayList<>();
        
        int sum = 0;
        
        for(int i=3 ; i<= n; i++){
            
            if(i%3 == 0 || i %5 ==0 || i%7 == 0 ){
                
                sum += i;
            }
        }
        
        return sum;
    }
}