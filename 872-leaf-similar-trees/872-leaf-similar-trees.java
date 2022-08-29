/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void leaf(TreeNode root,List<Integer> checkList){
        if(root==null){
            return;
        }if(root.left==null && root.right==null){
            checkList.add(root.val);
            return;
        }
        leaf(root.left,checkList);
        leaf(root.right,checkList);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> checkList1=new ArrayList<>();
        ArrayList<Integer> checkList2=new ArrayList<>();
        leaf(root1,checkList1);
        leaf(root2,checkList2);
        int size1=checkList1.size();
        int size2=checkList2.size();
        if(size1!=size2){
            return false;
        }
        for(int i=0;i<checkList1.size();i++){
            if(checkList1.get(i)!=checkList2.get(i)){
                return false;
            }
        }
        return true;    
    }
}