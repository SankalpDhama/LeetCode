class Solution {
    public String removeDuplicates(String s) {
        int size=s.length();
        StringBuilder str=new StringBuilder();
        Stack<Character> dupli=new Stack<>();
        for(int i=0;i<size;i++){
            if(dupli.isEmpty()){
                dupli.push(s.charAt(i));  
            }
            else if(s.charAt(i)==dupli.peek()){
                dupli.pop();
            }else{
                dupli.push(s.charAt(i));
            }
        }
        while(!dupli.isEmpty()){
            str.append(dupli.pop());
        }
        str=str.reverse();
        //System.out.println(str+"bheesh");
        return str.toString();
    }
}