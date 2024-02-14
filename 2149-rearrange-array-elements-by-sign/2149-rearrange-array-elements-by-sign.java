class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        ArrayList<Integer> pos_list = new ArrayList<>() ;
        ArrayList<Integer> neg_list = new ArrayList<>() ;
        for(int ele = 0 ; ele < nums.length ; ele++){

            if(nums[ele] > 0 ){

                pos_list.add(nums[ele]) ;
            }

            else{

                neg_list.add(nums[ele]) ;
            }

        }


        int  i = 0 ,j = 0 , k= 0;


        while (i < pos_list.size() && j < neg_list.size() ){

            nums[k++] = pos_list.get(i++);
            nums[k++] = neg_list.get(j++); 

        }

        return nums  ;
    }
}