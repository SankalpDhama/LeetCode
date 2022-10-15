/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
class Solution {
    void flat(Node cur,Stack<Node> auxStack){
        //System.out.println("recur works");
        if(cur.child!=null){
           // System.out.println("cur child exists");
            auxStack.push(cur.next);            
           // System.out.println(auxStack.peek().val);
            cur.next=cur.child;
            cur.child=null;
            cur.next.prev=cur;            
            cur=cur.next;
            flat(cur,auxStack);
        }if(!auxStack.isEmpty() && auxStack.peek()==null){
            while(!auxStack.isEmpty()){
                   if(auxStack.peek()==null){
                    auxStack.pop();                        
                   }else{
                        break;
                    }
                }
            }
        if(cur.next==null){
             if(auxStack.isEmpty()){  // System.out.println("empty stack");
               return;
            }else{
               // System.out.println("child connect");
                cur.next=auxStack.pop();
                cur.next.prev=cur;
            }
        }
        flat(cur.next,auxStack);
    }
    public Node flatten(Node head) {
        if(head==null){        
            return head;
        }
        Stack<Node> auxStack=new Stack<>();
        flat(head,auxStack);
        return head;
    }
}