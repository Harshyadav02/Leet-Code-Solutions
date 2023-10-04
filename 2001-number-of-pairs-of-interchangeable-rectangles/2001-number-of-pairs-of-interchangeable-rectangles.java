class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        
       // HashMap to store the ratio(width / height)  with value number of appreance
        
        HashMap<Double , Integer> map = new HashMap<>();
        
        //  number of pairs of interchangeable rectangles in rectangles. 
        long  count = 0;
        
        
        for (int i = 0; i < rectangles.length; i++){
            
            // ratio of width and height for rectangles
            double ratio = (double) rectangles[i][0]/rectangles[i][1];
           
            // checking if the ratio already exist inn the map or not if yes the increase the number of appreance 
            if(map.containsKey(ratio)){
                count += map.get(ratio) ;
                 map.put(ratio, map.get(ratio)+1);
            }
            
            else{
                map.put(ratio , 1)  ; 
            }
            
           
            
        }
        
      return count;  
    }
}