class Solution {
    public int evalRPN(String[] tokens) {
        int size=tokens.length;
        String a="+";
        String b="-";
        String c="*";
        String d="/";
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<size;i++){
                if(tokens[i].equals(a)){
                    int y=(dq.pollLast());
                    int x=(dq.pollLast());
                    dq.offerLast(x+y);
                }else if(tokens[i].equals(b)){
                    int y=(dq.pollLast());
                    int x=(dq.pollLast());
                    dq.offerLast(x-y);
                }else if(tokens[i].equals(c)){
                    int y=(dq.pollLast());
                    int x=(dq.pollLast());
                    dq.offerLast(x*y);
                }else if(tokens[i].equals(d)){
                    int y=(dq.pollLast());
                    int x=(dq.pollLast());
                    dq.offerLast(x/y);
                }else{
                dq.offerLast(Integer.valueOf(tokens[i]));
            }
        }
        return dq.pollLast();
    }
}