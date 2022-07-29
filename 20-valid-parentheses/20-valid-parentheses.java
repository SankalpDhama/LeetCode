class Solution {
    public boolean isValid(String s) {
        int size=s.length();
        Stack<Character> validStack=new Stack<>();
        char openCircle='(';
        char closeCircle=')';
        char openSquare='[';
        char closeSquare=']';
        char openCurly='{';
        char closeCurly='}';
        for(int i=0;i<size;i++){
            if(s.charAt(i)==openCircle || s.charAt(i)== openCurly || s.charAt(i)== openSquare){
                validStack.push(s.charAt(i));
            }else if(s.charAt(i)== closeCurly ||s.charAt(i)==closeCircle ||s.charAt(i)== closeSquare){
                if(validStack.isEmpty()){
                    return false;
                }
                else if(validStack.peek()==openCurly && s.charAt(i)==closeCurly){
                    validStack.pop();
                }else if(validStack.peek()==openCircle && s.charAt(i)==closeCircle){
                    validStack.pop();
                }else if(validStack.peek()==openSquare && s.charAt(i)==closeSquare){
                    validStack.pop();
                }else{
                    return false;
                }
            }
        }
        if(validStack.isEmpty()){
            return true;
        }else{
        return false;            
        }
    }
}