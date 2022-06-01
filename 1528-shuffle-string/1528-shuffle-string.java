class Solution {
    public String restoreString(String s, int[] indices) {
        String answer="";
        HashMap<Integer,Character> shuffleString=new HashMap<>();
        for(int i=0;i<indices.length;i++){
            shuffleString.put(indices[i],s.charAt(i));            
        }
        for(int j=0;j<indices.length;j++){
            answer=answer+shuffleString.get(j);
        }
        return answer;
    }
}