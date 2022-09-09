class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size=temperatures.length;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<size;i++){
            while(!s.isEmpty() && temperatures[s.peek()]<temperatures[i]){
                temperatures[s.peek()]=i-s.peek();
                s.pop();
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            temperatures[s.peek()]=0;
            s.pop();
        }
        return temperatures;
    }
}