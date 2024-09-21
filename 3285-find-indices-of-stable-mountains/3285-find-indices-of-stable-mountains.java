class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        
        List<Integer> result = new ArrayList<>();

        for(int index=1; index<height.length; index++){

            if(height[index-1]>threshold){
                result.add(index);
            }
        }
        return result;
    }
}