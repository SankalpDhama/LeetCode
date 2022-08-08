class Solution {
    public int calPoints(String[] ops) {
        int size=ops.length;
        Stack<Integer> score=new Stack<>();
        for(int i=0;i<size;i++){
            if(ops[i].equals("C")){
                score.pop();
            }else if(ops[i].equals("+")){
               // System.out.println(i+" bheesh");
                int lastPop=0;
                int secLastPop=0;
                lastPop=score.pop();
                secLastPop=score.peek();
                score.push(lastPop);
                score.push(lastPop+secLastPop);               
            }else if(ops[i].equals("D")){
                score.push(2*score.peek());
            }else{ 
                score.push(Integer.parseInt(ops[i]));
            }
            //System.out.println(score.peek());
        }
        int answer=0;
        while(!score.isEmpty()){
            answer+=score.pop();
        }
        return answer;
    }
}