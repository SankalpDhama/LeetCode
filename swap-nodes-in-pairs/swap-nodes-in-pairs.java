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
    void swap(ListNode prevList,ListNode cur){
        if(cur==null || cur.next==null){
            //System.out.println(cur);
            return;
        }
        if(prevList==null){
            //System.out.println(cur.val);
            ListNode next=cur.next;
            ListNode nextToNext=next.next;
            cur.next=nextToNext;
            next.next=cur;
            swap(cur,nextToNext);
            
        }else{            
           // System.out.println(cur.val);
            ListNode next=cur.next;
            ListNode nextToNext=next.next;
            cur.next=nextToNext;
            next.next=cur;
            prevList.next=next;
            prevList=next;
            //System.out.println(next.val);
            swap(cur,nextToNext);
        }
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=head.next;
        swap(null,head);
        return newHead;
    }
}