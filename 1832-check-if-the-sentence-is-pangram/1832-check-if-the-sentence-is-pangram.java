class Solution {
    public boolean checkIfPangram(String sentence) {
        String a="abcdefghijklmnopqrstuvwxyz";
        if(sentence.length()<26){
            return false;
        }
        for(int i=0;i<26;i++){
            if(!sentence.contains(String.valueOf(a.charAt(i)))){
                return false;
            }    
        }
        return true;
    }
}