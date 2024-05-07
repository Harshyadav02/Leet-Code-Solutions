class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int minimumBoats=0;
        int start=0, end=people.length-1;

        while(start<=end){

            int sum = people[start]+people[end];

            if(sum>limit){
                minimumBoats++;
                end--;
            }
            else{
                minimumBoats++;
                start++;
                end-- ;
            }

        }
        return minimumBoats;
    }
}