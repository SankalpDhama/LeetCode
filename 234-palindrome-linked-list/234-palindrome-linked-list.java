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
        ArrayList<Integer> palindrome=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            palindrome.add(cur.val);
            cur=cur.next;
        }
        int size=palindrome.size();
        for(int i=0;i<size/2;i++){
            if(palindrome.get(i)!=palindrome.get(size-1-i)){
                return false;
            }
        }
        return true;
    }
}