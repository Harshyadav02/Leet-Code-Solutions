class Solution {
       public  int getLastMoment(int n, int[] left, int[] right) {
        
       
        int left_max = 0;
        int right_max = 0;


        for(int i =0 ; i<right.length; i++){

            right_max = Math.max(right_max , n-right[i]);
        }

        for(int i =0 ; i<left.length; i++){

            left_max = Math.max(left_max , left[i]);
        }
        
        
        return Math.max(left_max ,right_max);
    }
}