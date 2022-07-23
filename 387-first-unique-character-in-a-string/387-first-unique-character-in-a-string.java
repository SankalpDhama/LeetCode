class Solution {
    public int firstUniqChar(String s) {
        int size=s.length();
        int count=1;
        HashMap<Character,Integer> uniqueMap=new HashMap<>();
        for(int i=0;i<size;i++){
            if(uniqueMap.containsKey(s.charAt(i))){
                count=uniqueMap.get(s.charAt(i));
                uniqueMap.put(s.charAt(i),++count);
                System.out.println("addedcount: "+s.charAt(i));
            }else{
                count=1;
                System.out.println("added: "+s.charAt(i));
                uniqueMap.put(s.charAt(i),count);
            }
        }
        for(int i=0;i<size;i++){
            if(uniqueMap.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}