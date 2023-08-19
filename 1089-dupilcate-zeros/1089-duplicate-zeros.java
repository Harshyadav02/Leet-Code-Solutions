class Solution {
    public void duplicateZeros(int[] arr) {

        // creating an empty hashmap to hold the array value in key-value pair
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        // creating an empty array to hold values
        int nums[] = new int[arr.length];
      
        int j = 0;  // j is an iterator  for the new array 

        for (int i = 0; i < arr.length; i++) {
          
            hash.put(i, arr[i]); // here index is key and array element is value 
        }
        // iterating over the hashmap to get the zeros 
        for (Map.Entry<Integer, Integer> e : hash.entrySet()) {
          
            if (j < nums.length ) {

              // if the value is zero adding it to the new array
                if (e.getValue() == 0) {
                    nums[j] = 0;
                    j++;

                    if (j < nums.length) {
                        nums[j] = 0; // Add a second zero
                    }
                } 
                // if the value is not same then add the same value in the new array
                else {
                    nums[j] = e.getValue();
                    
                }
            }
            j++;
        }

        for (int i = 0; i<nums.length; i++) {
            
            arr[i] = nums[i];   // copying the new array into old array     
        }
    }
}

