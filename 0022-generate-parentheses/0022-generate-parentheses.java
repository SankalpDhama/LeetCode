class Solution{
    void backtrack(String bracs,List<String> answer,int open,int close,int n){
        int size=bracs.length();
        if(size==2*n){
            answer.add(bracs);
            //bracs="";
            return;
        }
            if(open<n){
                //System.out.println("open brackets "+open);
                backtrack(bracs+"(",answer,open+1,close,n);                 
            }
            if(close<open){
                //System.out.println("close brackets "+close);
                backtrack(bracs+")",answer,open,close+1,n);                
            }
               // System.out.println("open val "+open);        
        }
    
    public List<String> generateParenthesis(int n) {
        List<String> answer=new ArrayList<>();
        String bracs="(";
        backtrack(bracs,answer,1,0,n);
        return answer;
    }
}