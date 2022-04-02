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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=new ListNode();
        ListNode countLength=new ListNode();
        int length=0;
        countLength=head;
        temp=head;
        int j=1;
        if(head.next==null){ 
            return null;
        }
        while(countLength!=null){
            //System.out.println(countLength.val);
            countLength=countLength.next;
            j++;
            length++;   
        }
        //System.out.println(length-n);
        if(length-n==0){
            //head.next=null;
          return head.next;  
        }
        for(int i=1;i<length-(n);i++){
            temp=temp.next;
        }
        {
            temp.next=temp.next.next;
        }
           
        
        //System.out.println(length);
        return head;
    }
}