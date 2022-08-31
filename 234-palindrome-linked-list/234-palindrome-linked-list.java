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
    public boolean isPalindrome(ListNode head) {
        //ArrayList<Integer> palindrome=new ArrayList<>();
        ListNode cur=head;
        int length=0;
        while(cur!=null){
            //palindrome.add(cur.val);
            length++;
            cur=cur.next;
        }
        int[] palindrome=new int[length];
        int i=0;
        cur=head;
         while(cur!=null){
            palindrome[i]=cur.val;
           //  System.out.println(cur.val);
            cur=cur.next;
            i++;
        }
       // System.out.println(Arrays.toString(palindrome));
        for(int j=0;j<length/2;j++){
            if(palindrome[j]!=palindrome[length-1-j]){
                return false;
            }
        }
        return true;
    }
}