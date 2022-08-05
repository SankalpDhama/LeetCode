class Solution {
    public boolean isAnagram(String s, String t) {
        int sizeS=s.length();
        int sizeT=t.length();
        if(sizeS!=sizeT){
            return false;
        }    
        HashMap<Character,Integer> anagramMap=new HashMap<>();
        for(int i=0;i<sizeS;i++){
            int count=0;
            if(anagramMap.containsKey(s.charAt(i))){
                count=anagramMap.get(s.charAt(i));
                anagramMap.put(s.charAt(i),++count);                
            }else{
                anagramMap.put(s.charAt(i),++count);
            }
        }
        for(int i=0;i<sizeT;i++){
            int count=0;
            if((anagramMap.containsKey(t.charAt(i))) && (anagramMap.get(t.charAt(i))!=0)){
                count=anagramMap.get(t.charAt(i));
                anagramMap.put(t.charAt(i),--count);
            }else{
                return false;
            }
        }
        return true;
    }
}