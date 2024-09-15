class Solution {
    public int numberOfChild(int n, int k) {
        
        int direction = 1;
        int position = 0;
        for(int i=0; i<k; i++){
            
            position += direction;

            if(position==0){
                direction = 1;
            }
            if(position==n-1) {
                direction = -1;
                
            }
                
            System.out.println(position);
        }
        return position;
    }
}