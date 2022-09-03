/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int listLength(ListNode head){
        int length=0;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            length++;
        }
        return length;
    }
    ListNode last(ListNode head){
        ListNode cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        return cur;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int length=listLength(head);
        k=k%length;
        if(k==0){
            return head;
        }
        System.out.println(k+"k");
       System.out.println("length"+length);
        int index=Math.abs(k-length);
        System.out.println(index+"index");
        int nodeInd=1;
        ListNode newLastNode=head;
        while(nodeInd!=index){
            newLastNode=newLastNode.next;
            nodeInd++;
        }
        System.out.println(newLastNode.val+"bheesh");
        ListNode newHead=newLastNode.next;
        ListNode last=last(head);
        last.next=head;
        newLastNode.next=null;
        return newHead;
    }
}