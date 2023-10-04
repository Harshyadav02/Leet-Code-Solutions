class Solution {
    public int fib(int n) {
        
        int array []= new int[n+1];
        
        if(n == 0 || n==1){
            return n;
        }
        
        if(array[n]!=0){
            return n;
        }
        
        array[n] = fib(n -1) + fib(n -2) ;
        
        return array[n];
    }
}