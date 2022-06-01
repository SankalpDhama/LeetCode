class Solution {
    public String restoreString(String s, int[] indices) {
        char[] answer=new char[indices.length];
        HashMap<Integer,Character> shuffleString=new HashMap<>();
        for(int i=0;i<indices.length;i++){
            shuffleString.put(indices[i],s.charAt(i));            
        }
        for(int j=0;j<indices.length;j++){
            answer[j]=shuffleString.get(j);
        }
        return new String(answer);
    }
}