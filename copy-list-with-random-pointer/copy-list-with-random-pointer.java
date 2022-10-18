/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Node copy=new Node(-1);
        Node curr=head;
        Node next;
        Node updated;
        while(curr!=null){
            next=curr.next;
            Node temp=new Node(curr.val);
            temp.next=next;
            curr.next=temp;
            curr=next;
        }
        curr=head;
        updated=curr.next;
        while(curr!=null)
        {
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }
        curr=head;
        
        while(curr!=null){
            next=curr.next;
            curr.next=next.next;
            curr=curr.next;
            if(curr!=null)
            next.next=curr.next;
        }
        return updated;
    }
}