class MyLinkedList {
    public class ListNode{
        int val=0;
        ListNode next=null;
        public ListNode(int val){
            this.val=val;
            next=null;
        }
    }
        ListNode head=null;
        ListNode tail=null;
        int size=0;
    public MyLinkedList() {
    }
    // public void call(){
    //     int sizeNew=0;
    //     ListNode temp=head;
    //     while(temp!=null){
    //         System.out.print(temp.val+" ");
    //         temp=temp.next;
    //         sizeNew++;
    //     }
    //    System.out.println(" start "+sizeNew+" sizeNew "+size+" size "+"end");
    // }
    public int get(int index){
        if(index>=size){
            return -1;
        }
        ListNode cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
            if(cur==null){
                return -1;
            }
        }
       // call();
        return cur.val;
    }
    
    public void addAtHead(int val){
       // System.out.println("addAt head "+val);
        ListNode newHead=new ListNode(val);
        newHead.next=head;
        head=newHead;
        if(size==0){
            tail=head;
        }
        size++;
     //  call();
    }
    
    public void addAtTail(int val){
      // System.out.println(tail.val+" tail value ");
        ListNode newTail=new ListNode(val);
        if(size==0){
            tail=newTail;
            head=tail;
            size++;
          // call();
            return;
        }
        tail.next=newTail;
        tail=newTail;
        size++;
     // call();
    }
    
    public void addAtIndex(int index, int val){
        //System.out.println(index+" add At index ");
        if(index==0){
            addAtHead(val);
          // call();
            return;
        }
        if(index==size){
            addAtTail(val);
         //  call();
            return;
        }if(index>size){
         //   call();
            return;
        }
        ListNode cur=head;
        for(int i=0;i<index-1;i++){
           cur=cur.next;
       }
        ListNode save=cur.next;
        ListNode addNode=new ListNode(val);
        cur.next=addNode;
        addNode.next=save;
        size++;
      // call();
    }    
    public void deleteAtIndex(int index) {
        //System.out.println(index+" deleteAt Index ");
        if(index>=size){
           // System.out.println("san");
         //  call();
            return;
        }
        if(index==0){
            head=head.next;
            size--;
           // call();
            return;
        }
        if(size==1 || size==0){
            head=null;
            if(size==1){
            size--;                
            }
         //  call();
            return;
        }
        ListNode cur=head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
           //System.out.println(cur.val+"val");
        }
        //System.out.println(cur.next.val);
        if(index==size-1){
            tail=cur;
            cur.next=null;
            size--;
           // call();
            return;                
        }
        cur.next=cur.next.next;
        size--;
       // call();
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */