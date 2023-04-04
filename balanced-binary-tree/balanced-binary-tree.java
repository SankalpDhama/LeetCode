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
    boolean balanced=true;
    int balance(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=balance(root.left);
        int r=balance(root.right);
        if(Math.abs(r-l)>1){
            balanced=false;
        }
        return (1+Math.max(r,l));
    }
    public boolean isBalanced(TreeNode root) {
        balance(root);
        return balanced;
    }
}