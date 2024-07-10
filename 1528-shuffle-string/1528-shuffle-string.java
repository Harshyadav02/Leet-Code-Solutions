class Solution {
    public String restoreString(String s, int[] indices) {

        StringBuilder sb = new StringBuilder(s);
        for(int index=0;index<indices.length; index++){
            sb.deleteCharAt(indices[index]);
            sb.insert(indices[index],s.charAt(index));
        } 

        return sb.toString();
    }
}