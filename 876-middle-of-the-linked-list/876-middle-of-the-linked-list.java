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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        ListNode answerNode=head;        
        int countLength=1;
        while(temp.next!=null){
            temp=temp.next;
            countLength++;
        }
        // //System.out.println(countLength);
        // if(countLength%2==0){
        //     countLength=countLength/2;
        //    System.out.println(countLength+"this is even length");
        // }else{
        //     countLength=countLength/2;
        //    // System.out.println(countLength+"this is odd length");
        // }
        countLength=countLength/2;
        
        for(int i=1;i<=countLength;i++){
            answerNode=answerNode.next;
            //System.out.println()
        }
        return answerNode;
    }
}