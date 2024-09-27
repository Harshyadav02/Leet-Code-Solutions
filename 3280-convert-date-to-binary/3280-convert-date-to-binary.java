class Solution {
    public String convertDateToBinary(String date) {
        
        String dateArray[] = date.split("-");
        StringBuilder binaryDate = new StringBuilder();
        for(int index=0; index<dateArray.length; index++){
            
            binaryDate.append(Integer.toBinaryString(Integer.valueOf(dateArray[index]))).append("-");
            
        }
        
        
        return binaryDate.substring(0,binaryDate.length()-1);
    }
}