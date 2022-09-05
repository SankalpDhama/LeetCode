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
    void oddEven(ListNode cur,ListNode prevEven){
        if(prevEven==null || prevEven.next==null){
           // System.out.println(prevEven.val);
            return;
        }
        
        ListNode nextOdd=prevEven.next;
       // ListNode nextEven=nextOdd.next;
        prevEven.next=nextOdd.next;
        nextOdd.next=cur.next;
        cur.next=nextOdd;
        oddEven(cur.next,prevEven.next);
    }
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        oddEven(head,head.next);
        return head;
    }
}