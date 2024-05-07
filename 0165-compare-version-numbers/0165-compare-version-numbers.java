class Solution {
    public int compareVersion(String version1, String version2) {
        
        // Splitting the strings on the basis of "."
        String version1Char[] = version1.split("\\.");
	    String version2Char[] = version2.split("\\.");
	    
        // pointer for both the arrays 
	    int pointerV1=0,pointerV2=0;

	    while(pointerV1<version1Char.length && pointerV2<version2Char.length){
	       
	        if(Integer.valueOf(version1Char[pointerV1]) < Integer.valueOf(version2Char[pointerV2])){
                return -1;
            }
            else if(Integer.valueOf(version1Char[pointerV1]) > Integer.valueOf(version2Char[pointerV2])){
                return 1;
            }
            
           
	        pointerV1++;
            pointerV2++;
	    }
	    while(pointerV1<version1Char.length){
	        
            if(Integer.valueOf(version1Char[pointerV1]) < 0){
                return -1;
            }
            else if(Integer.valueOf(version1Char[pointerV1]) > 0){
                return 1;
            }
            pointerV1++;
	    }
	    while(pointerV2 < version2Char.length){
            if(Integer.valueOf(version2Char[pointerV2])>0) {
                return -1;
            }
            else if(Integer.valueOf(version2Char[pointerV2])<0){
                return 1;
            }
            pointerV2++;
	    }
	    
	    
	    return 0;


    }
}