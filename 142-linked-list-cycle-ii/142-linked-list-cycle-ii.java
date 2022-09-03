/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    ListNode detect(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                // System.out.println(slow.val);
                    return slow;
            }
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode index=detect(head);
        if(index==null){
            return null;
        }
        ListNode cur=head;
        while(index!=cur){
            cur=cur.next;index=index.next;
        }
        return index;
    }
}