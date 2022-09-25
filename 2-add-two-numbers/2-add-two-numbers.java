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
    ListNode lengthMax(ListNode l1,ListNode l2){
        ListNode cur1=l1;
        ListNode cur2=l2;
        int list1=0;
        int list2=0;
        while(cur1!=null){
            cur1=cur1.next;
            list1++;
        }
        while(cur2!=null){
           // System.out.println("bheesh L2");
            cur2=cur2.next;
            list2++;            
        }
        //System.out.println(list1);
        //System.out.println(list2);
        if(list1>=list2){
           // System.out.println("bheesh"+l1.val);
            return l1;
        }else{
            return l2;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val=0;
        // if(l1.next==null && l2.next==null){
        //     val=l1.val+l2.val;
        // }
        boolean sameLength=false;
        ListNode cur1=l1;
        ListNode cur2=l2;
        int carry=0;
        ListNode max=lengthMax(cur1,cur2);
       // System.out.println(max.val);
        ListNode min=null;
        if(max==l1){
            min=l2;
        }else{
            min=l1;
        }
       // System.out.println(min.val);
        ListNode prev=null;
        while(min!=null){
            val=min.val+max.val+carry;
            carry=val/10;
            val=val%10;
            max.val=val;
            prev=max;
            max=max.next;
            min=min.next;
            if(max==null){
                sameLength=true;
            }
        }
        //System.out.println(sameLength);
        if(!sameLength){
            while(max!=null){
                val=max.val+carry;
                carry=val/10;
                val=val%10;
                max.val=val;
                prev=max;
                max=max.next;
            }
        }
        if(carry!=0){
            ListNode newNode=new ListNode(carry);
            prev.next=newNode;
        }
        return lengthMax(l1,l2);
    }
}