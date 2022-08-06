class Solution {
    public boolean backspaceCompare(String s, String t) { 
        int sSize=s.length();
        int tSize=t.length();
        Stack<Character> sStack=new Stack<>();
        Stack<Character> tStack=new Stack<>();
        for(int i=0;i<sSize;i++){
            if(s.charAt(i)=='#' && sStack.isEmpty()){
                continue;
            }else if(s.charAt(i)=='#'){
                sStack.pop();
            }else{
                sStack.push(s.charAt(i));
            }
        }for(int i=0;i<tSize;i++){
            if(t.charAt(i)=='#' && tStack.isEmpty()){
                continue;
            }else if(t.charAt(i)=='#'){
                tStack.pop();
            }else{
                tStack.push(t.charAt(i));
            }
        }
        if(sStack.size()!=tStack.size()){
            return false;
        }
       // System.out.println(sStack.size());
        while(!sStack.isEmpty()){
            //System.out.println(sStack.peek());
            //System.out.println(tStack.peek());
            if(sStack.pop()!=tStack.pop()){
                return false;
            }
        }
        return true;
    }
}