// class Solution {
//     public int findMaxLength(int[] nums) {
        
//         int totalLength = 0;

//         for(int i = 0 ; i < nums.length; i++){
//             int zeroCount = 0 , onesCount = 0; 

//             for(int j= i; j < nums.length; j++){

//                 if(nums[j] == 0){
//                     zeroCount++ ;
//                 }
//                 else{
//                     onesCount ++;
//                 }

//                 if(zeroCount == onesCount){
//                     totalLength = Math.max(totalLength, zeroCount + onesCount);
//                 }
//             }
//         } 
//         return totalLength;
//     }
// }


class Solution {
    public int findMaxLength(int[] nums) {
        
        int totalLength = 0 ;
        int sum = 0 ;
        HashMap<Integer , Integer > map = new HashMap<>() ;

        // Converting all zeros to -1 because if a subarray have sum zero then there will be equal number of 0 & 1

        for(int index = 0 ; index < nums.length; index++ ){

            if(nums[index]==0){
                nums[index] = -1 ;
            }
        } 

        for(int index = 0 ; index < nums.length; index++){

            sum += nums[index] ;

            if(sum == 0){
                totalLength = Math.max(totalLength , index+1) ;
            }
            
            if(map.containsKey(sum)){
                totalLength = Math.max(totalLength , index - map.get(sum));
            }else{
                map.put(sum ,index);
            }
        }
        return totalLength ;
    }
}
