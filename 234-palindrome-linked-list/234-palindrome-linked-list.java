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
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }        
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=head;
        ListNode end=reverse(slow);
        //System.out.println(end.val);
        while(end!=null){
            if(fast.val!=end.val){
                return false;
            }
            fast=fast.next;
            end=end.next;
        }
        return true;
    }
}