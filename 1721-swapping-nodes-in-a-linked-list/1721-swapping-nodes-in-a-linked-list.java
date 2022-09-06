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
    ListNode one(ListNode head){
        ListNode temp=head;
        ListNode end=head.next;        
        ListNode prevEnd=head;        
        while(end.next!=null){
            prevEnd=prevEnd.next;
            end=end.next;
        }
        end.next=head.next;
        prevEnd.next=temp;
        head.next=null;  
        return end;
    }
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
        if(len==2){
           // System.out.println("san");
            ListNode temp=head.next;
            head.next=null;
            temp.next=head;
            return temp;
        }
        if(k==1 || k==len){
            System.out.println("bheehs"+len);
            return one(head);
        }
       // System.out.println(len+"bheesh");
        if(len==2){
            ListNode start=head;
            ListNode end=head.next;
            start.next=null;
            end.next=start;
            head=end;
            return head;
        }
        ListNode curStart=head;
        ListNode curEnd=head;
        for(int i=1;i<k-1;i++){
            curStart=curStart.next;
        }
        for(int i=1;i<len-k;i++){
            curEnd=curEnd.next;
        }
        ListNode Start=curStart.next;
        ListNode End=curEnd.next;
        curStart.next=End;
        curEnd.next=Start;
        ListNode startNext=Start.next;
        Start.next=End.next;
        End.next=startNext;
        return head;
    }
}