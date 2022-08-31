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
       // void remove(ListNode head,int val){
       //      if(head==null){
       //          return;
       //      }if(head.val==val){
       //          head=head.next;
       //      }else if(head.next.val==val){
       //          head.next=head.next.next;
       //      }
       //      remove(head.next,val);
       //  }
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
            }else{
            cur=cur.next;                
            }
        }
        return head;
    }
}