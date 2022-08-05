class Solution {
    public boolean isAnagram(String s, String t) {
        int sizeS=s.length();
        int sizeT=t.length();
        int[] alpha=new int[26];
        if(sizeS!=sizeT){
            return false;
        }           
        for(int i=0;i<sizeS;i++){
            alpha[(int)s.charAt(i)-97]++; 
        }
        for(int i=0;i<sizeT;i++){
            if(alpha[(int)t.charAt(i)-97]!=0){
                alpha[(int)t.charAt(i)-97]--;
            }else{
                return false;
            }            
        }
        return true;
    }
}