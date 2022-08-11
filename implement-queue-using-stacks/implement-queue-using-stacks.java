class MyQueue {
    
    Stack<Integer> queueToStack1=new Stack<>();
    Stack<Integer> queueToStack2=new Stack<>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!queueToStack1.isEmpty()){
            queueToStack2.push(queueToStack1.pop());
        }
        queueToStack1.push(x);
        while(!queueToStack2.isEmpty()){
            queueToStack1.push(queueToStack2.pop());
        }
    }
    
    public int pop() {
       return queueToStack1.pop();
    }
    
    public int peek() {
       return queueToStack1.peek();
    }
    
    public boolean empty() {
       return queueToStack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */