class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int i =0, j=1,k=2;
       
        if(arr.length<3){
            return false  ;
        }
        while(k<arr.length){

            if(arr[i]%2!=0 && arr[j]%2!=0 && arr[k]%2!=0){

                return true;
                
            }
            i++;
            j++;
            k++;
            
        }
        return false;
    }
}