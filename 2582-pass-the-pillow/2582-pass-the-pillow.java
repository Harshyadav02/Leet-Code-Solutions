class Solution {
   
    boolean direction;
    public int passThePillow(int n, int time) {
        int ithPerson=1;
        
        while(time>0){
            if(ithPerson==n){
                direction = false;
            }
            else if(ithPerson==1){
                direction=true;
            }
            if(direction){
                ithPerson++;
                time--;
            }
            else{
                ithPerson--;
                time--;
            }
            
        }
        return ithPerson;
    }
}