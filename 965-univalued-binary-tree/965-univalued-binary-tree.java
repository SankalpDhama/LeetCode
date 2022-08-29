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
    boolean isUni(TreeNode root,int val,boolean flag){
        if(root==null){
            return true;
        }
        if(root.val!=val){
            flag=false;
            return flag;
        }
        return (isUni(root.left,val,flag) && isUni(root.right,val,flag));
    }
    public boolean isUnivalTree(TreeNode root) {
        int val=root.val;
        return isUni(root,val,true);
    }
}