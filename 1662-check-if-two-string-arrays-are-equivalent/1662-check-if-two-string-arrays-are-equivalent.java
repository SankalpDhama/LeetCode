class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int size1=word1.length;
        int size2=word2.length;
        int sizeMax=Math.max(size1,size2);
        StringBuilder wordOne=new StringBuilder();
        StringBuilder wordTwo=new StringBuilder();
        for(int i=0;i<sizeMax;i++){
            if(i<size1){
            wordOne.append(word1[i]);                
            }if(i<size2){
                wordTwo.append(word2[i]);
            }
        }
       if(wordOne.toString().equals(wordTwo.toString())){
           return true;
       }else{
           return false;
       } 
    }
}