class Solution {
    public String interpret(String command) {
        int size=command.length();
        StringBuilder soccer=new StringBuilder();
        for(int i=0;i<size;i++){
            if(command.charAt(i)=='G'){
                soccer.append("G");
            }else if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                soccer.append("al");
            }else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                soccer.append("o");
            }
        }
        return soccer.toString();
    }
}