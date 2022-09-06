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
        int len=1;
        ListNode cur=head;
        while(cur.next!=null){
            cur=cur.next;
            len++;
        }
        return len;
    }
    ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;            
        }
        return prev;
    }
    ListNode lastNode(ListNode head){
        ListNode cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        return cur;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int len=length(head);
        if(right==len && left==1){         
            return reverse(head);
        }
        if(left==right || head==null){
            return head;
        }
        ListNode leftNode=head;
        ListNode rightNode=head;
        for(int i=1;i<left-1;i++){
            leftNode=leftNode.next;
        }
        ListNode prevLeftNode=leftNode;
        if(left!=1){
        leftNode=leftNode.next;            
        }
        for(int i=1;i<right;i++){
            rightNode=rightNode.next;
        }
            ListNode rightNodeNext=rightNode.next;
            rightNode.next=null;
            ListNode newListNode=reverse(leftNode);
            ListNode newListLast=lastNode(newListNode);
        if(left!=1){
            prevLeftNode.next=newListNode;            
        }else{
            head=newListNode;
        }
        if(right!=len){
            newListLast.next=rightNodeNext;            
        }
        return head;
    }
}