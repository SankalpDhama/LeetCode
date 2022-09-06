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

    int length(ListNode head){
        ListNode cur=head;
        int len=1;
        while(cur.next!=null){
            cur=cur.next;
            len++;
        }
        return len;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int len=length(head);
        if(head==null || head.next==null){
            return head;
        }
        ListNode curStart=head;
        ListNode curEnd=head;
        for(int i=1;i<k;i++){
            curStart=curStart.next;
        }
        for(int i=1;i<len-(k-1);i++){
            curEnd=curEnd.next;
        }
        int temp=curStart.val;
        curStart.val=curEnd.val;
        curEnd.val=temp;
        return head;
    }
}