class Solution {
    public int[] sortArray(int[] nums) {
       
        if (nums.length == 1){
            return nums ;
        }
        int mid = nums.length / 2 ;
            
        int left[] = sortArray(Arrays.copyOfRange(nums , 0,mid)) ;
        int right [] = sortArray(Arrays.copyOfRange(nums ,mid , nums.length)) ;
        
        
         return merge(left , right) ;
    }
    
    private static int [] merge(int left[] , int right []){
        
        int helper[] = new int[left.length + right.length] ;
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while( i < left.length && j < right.length){
            
            if(left[i] < right[j]){
                
                helper[k++] = left[i++] ;
            }
            else{
                helper[k++] = right[j++] ;
            }
        }
        
        
        // if the elements are left in the left array 
        
        while(i < left.length) {
            
            helper[k++] = left[i++] ;
        }
        
        // if the right arra have elemets 
        
        while( j < right.length){
            helper[k++] = right[j++] ;
        }
        
       return helper ; 
    }

}