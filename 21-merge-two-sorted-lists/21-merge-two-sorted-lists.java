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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur1=list1;
        ListNode cur2=list2; 
        if(list1==null && list2==null){
            return list1;
        }
        if(list1==null && list2!=null){
            return list2;
        }if(list1!=null && list2==null){
            return list1;
        }
        ListNode cur=cur1;
        if(cur1.val>cur2.val){
            cur=cur2;
            cur2=cur2.next;
        }else{
            cur1=cur1.next;
        }
        while(cur1!=null && cur2!=null){
            if(cur1.val>cur2.val){
                cur.next=cur2;
                cur2=cur2.next;
                cur=cur.next;
            }else if(cur2.val>cur1.val){
                cur.next=cur1;
                cur1=cur1.next;
                cur=cur.next;
            }else{
                cur.next=cur1;
                cur1=cur1.next;
                cur=cur.next;
                cur.next=cur2;
                cur2=cur2.next;
                cur=cur.next;
            }
        }
        if(cur1!=null){
            cur.next=cur1;
        }if(cur2!=null){
            cur.next=cur2;
        }
        if(list1.val>list2.val){
            return list2;
        }else{
            return list1;
        }
    }
}