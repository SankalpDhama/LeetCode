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
    ListNode middle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        if(head.next==null || head.next.next==null){
            return;
        }
        ListNode mid=middle(head);
        Stack<ListNode> nodes=new Stack<>();
        while(mid!=null){
            nodes.push(mid);
            mid=mid.next;
        }
        ListNode cur=head;
        while(!nodes.isEmpty()){
            ListNode next=cur.next;
            cur.next=nodes.pop();
            cur.next.next=next;
            cur=next;
        }
        if(cur.next==cur){
            cur.next=null;
        }else{
            cur.next.next=null;
        }
    }
}