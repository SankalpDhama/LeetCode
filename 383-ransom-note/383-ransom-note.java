class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int size=magazine.length();
        int ranSize=ransomNote.length();
        int count=1;
        HashMap<Character,Integer> magaMap=new HashMap<>();
        for(int i=0;i<size;i++){
            if(magaMap.containsKey(magazine.charAt(i))){
                count=magaMap.get(magazine.charAt(i));
                magaMap.put(magazine.charAt(i),++count);
                count=1;
          }else{
                magaMap.put(magazine.charAt(i),count);
            }
      }
        for(int i=0;i<ranSize;i++){
            if(magaMap.containsKey(ransomNote.charAt(i))){
                if(magaMap.get(ransomNote.charAt(i))==0){
                    return false;
                }else{
                    count=magaMap.get(ransomNote.charAt(i));
                    magaMap.put(ransomNote.charAt(i),--count);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}