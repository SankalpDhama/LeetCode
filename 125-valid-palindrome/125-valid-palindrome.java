class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");     
        if(s=="" || s.length()==1){
            return true;
        }
        int i=0,j=s.length()-1;        
        while(i<j){
            if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){        
                i++;
                j--;
                continue;            
            }else{        
                return false;    
            }
        }
        return true;
    }
}