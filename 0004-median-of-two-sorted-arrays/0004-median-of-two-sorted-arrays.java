class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
          int i =  0 , j = 0 , k = 0 ;
          int nums3 [] = new int[nums1.length+nums2.length]  ;

            while(i < nums1.length && j < nums2.length){

                if(nums1[i] < nums2[j]){
                    nums3[k++] = nums1[i++];
                }
                else{
                    nums3[k++] = nums2[j++] ;
                }

            } 
             
        
        while(i < nums1.length){

                 nums3[k++] = nums1[i++];
             }

             
        while(j < nums2.length){

                 nums3[k++] = nums2[j++] ;
             }  

              
       
              
        double sum = 0;    
            
        if(nums3.length%2 != 0 ){

                return (double)nums3[nums3.length /2 ];
            }
                
             
        else{
                int middle1 = nums3[nums3.length /2 -1];
                int middle2 = nums3[nums3.length / 2];
        return ((double) middle1 + (double) middle2) / 2.0;

                 
             }   
          
       
} }