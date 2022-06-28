class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sSize=s.length();
        int tSize=t.length();
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character>  isoMap=new HashMap<>();
        for(int i=0;i<sSize;i++){
            if(isoMap.containsKey(s.charAt(i))){
                 if(isoMap.get(s.charAt(i))!=t.charAt(i)){                             
                     return false;
                 }}
            else if(isoMap.containsValue(t.charAt(i))){
                     return false;                               
            }else{
                isoMap.put(s.charAt(i),t.charAt(i));
            }                
        }
        return true;
    }
}