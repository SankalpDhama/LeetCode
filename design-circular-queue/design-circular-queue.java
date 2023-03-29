class MyCircularQueue {
    ListNode head=new ListNode(-1);
    ListNode tail;
    int cap;
    int size=0;
    public MyCircularQueue(int k) {    
        cap=k;
    }
    
    public boolean enQueue(int value) {
        if(size==cap){
            return false;
        }
        if(size==0){
            head.next=new ListNode(value);
            tail=head.next;

        }else{
            tail.next=new ListNode(value);
            tail=tail.next;
            tail.next=head;
        }
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size==0){
            return false;
        }else{
            head.next=head.next.next;
        }
        size--;
        return true;
    }
    
    public int Front() {
        if(size==0){
            return -1;
        }else{
            return head.next.val;
        }
    }
    
    public int Rear() {
        if(size==0){
            return -1;
        }else{
            return tail.val;
        }
    }
    
    public boolean isEmpty() {
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isFull() {
        if(size==cap){
            return true;
        }else{
            return false;
        }
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */