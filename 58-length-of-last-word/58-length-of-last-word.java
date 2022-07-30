class Solution {
    public int lengthOfLastWord(String s) {
        int size=s.length()-1;
        char ch=(char)32;
        int answer=0;
        for(int i=size;i>=0;i--){
            if(s.charAt(i)!=ch){                
                answer++;
                //System.out.println(s.charAt(i)+" "+answer);
            }else if(s.charAt(i)==ch && answer!=0){
                break;
            }
        }
        return answer;
    }
}