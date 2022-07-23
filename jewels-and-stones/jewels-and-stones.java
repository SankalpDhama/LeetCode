class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelsSize= jewels.length();
        int stonesSize= stones.length();
        HashSet<Character> jewelSet=new HashSet<>();        
        int answer=0;
        for(int i=0;i<jewelsSize;i++){
            jewelSet.add(jewels.charAt(i));
        }
        for(int i=0;i<stonesSize;i++){
            if(jewelSet.contains(stones.charAt(i))){
                answer++;
            }
        }
        return answer;
    }
}