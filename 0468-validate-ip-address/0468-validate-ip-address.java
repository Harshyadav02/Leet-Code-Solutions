class Solution {
    public String validIPAddress(String queryIP) {

        String ipv6Range = "abcdefABCDEF1234567890" ;

        String ipv4Range = "0123456789" ;
        String answer = "" ;

        if (queryIP.equals("")) return "Neither" ;
        if(queryIP.substring(queryIP.length() -1).equals(":") || queryIP.substring(queryIP.length() -1).equals(".")){
            return "Neither" ;
        }
        if(queryIP.contains(":")){
            
            String ipv6List[] = queryIP.split(":") ;
            
               
            
            if(ipv6List.length != 8){
                return "Neither" ;
            }
            else {
                
                for(String ip : ipv6List){

                    if((ip.length() > 4 || ip.length() < 1)){
                        

                        return "Neither" ; 
                    }

                        for(int ch = 0 ; ch < ip.length() ; ch ++){
                       
                        if(!ipv6Range.contains(String.valueOf(ip.charAt(ch)))) return "Neither" ;
                        }
                    
                
                answer =  "IPv6" ;
                }
                
            }

        }

        else {
           
            String ipv4List[] = queryIP.split("\\.") ;            
            if(ipv4List.length != 4) return "Neither" ;
            for(String ip : ipv4List){

                    if((ip.length() > 3 || ip.length() < 1)){
                    //    System.out.println("length smaller");
                        return "Neither" ; 
                    }
                    
                    for(int ch = 0 ; ch < ip.length() ; ch ++){
                        System.out.println("inside for loop");
                        if( ip.length() != 1 && ch == 0 && String.valueOf(ip.charAt(ch)).equals("0"))
                        //
                        {
                            // System.out.println("if ch == 0") ;
                            return "Neither" ;
                        }
                        
                        else if(!ipv4Range.contains(String.valueOf(ip.charAt(ch)))) {
                            // System.out.println("inside if  ele not in string");
                            return "Neither" ;
                        }
                        
                    }
                    if(Integer.valueOf(ip) > 255) return "Neither" ;
                    answer =  "IPv4" ;

                }
        }

        return answer ;
    }
}