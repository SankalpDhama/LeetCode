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
    void del(ListNode cur){
       if(cur==null || cur.next==null){
           return;
       }
        int curVal=cur.val;
        if(curVal==cur.next.val){
            cur.next=cur.next.next;
            del(cur);
        }
        del(cur.next);
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        del(cur);
        return head;
    }
}