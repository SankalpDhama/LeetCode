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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode cur=head;
        ListNode prev=null;
        int repeatVal=101;
        while(cur!=null){
            if(cur.val==repeatVal || (cur.next!=null && cur.val==cur.next.val)){
                repeatVal=cur.val;
                if(prev==null){
                    head=head.next;
                }else{
                prev.next=cur.next;
                }
                cur=cur.next;                    
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        return head;
    }
}
