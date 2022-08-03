class MyStack {
    
    Queue<Integer> stackQueue1=new LinkedList<>();
    Queue<Integer> stackQueue2=new LinkedList<>();   
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        while(!stackQueue1.isEmpty()){
            stackQueue2.add(stackQueue1.remove());
        }
        stackQueue1.add(x);
        while(!stackQueue2.isEmpty()){
            stackQueue1.add(stackQueue2.remove());
        }
    }
    
    public int pop() {
        return stackQueue1.remove();
    }
    
    public int top() {
        return stackQueue1.peek();
    }
    
    public boolean empty() {
        return stackQueue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */