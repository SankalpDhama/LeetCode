class Solution {
    public int[] finalPrices(int[] prices) {
        int size=prices.length;
        Stack<Integer> discountStack=new Stack<>();
        int[] answer=prices;
        for(int i=0;i<size;i++){
            while(!discountStack.isEmpty() && prices[discountStack.peek()]>=prices[i]){
                answer[discountStack.peek()]=prices[discountStack.peek()]-prices[i];
                discountStack.pop();                
            }
            discountStack.push(i);
        }
        return answer;
    }
}