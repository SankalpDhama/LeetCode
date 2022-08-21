class Solution {    
    public String reverseWords(String s) {        
        String[] stringArr=s.split("\\s+");
        int size=stringArr.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<size;i++){
            for(int j=stringArr[i].length()-1;j>=0;j--){
                sb.append(stringArr[i].charAt(j));
            }
            if(i!=size-1){
            sb.append(" ");                
            }
            stringArr[i]=sb.toString();
            sb.setLength(0);
        }
        StringBuilder answer=new StringBuilder();
        for(int i=0;i<size;i++){
            answer.append(stringArr[i]);
        }
        return answer.toString();
    }
}