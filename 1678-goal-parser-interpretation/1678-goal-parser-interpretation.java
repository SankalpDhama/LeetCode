class Solution {
    public String interpret(String command) {
        command=command.replace("()","o");
        command=command.replace("G","G");
        command=command.replace("(al)","al");  
        return command;
    }
}