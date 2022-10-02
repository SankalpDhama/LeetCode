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
    void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        TreeNode left=root.left;
        TreeNode right=root.right;
        root.left=null;
        root.right=left;
        TreeNode p=root;
        while(p.right!=null){
            p=p.right;
        }
        p.right=right;   
    }
    public void flatten(TreeNode root) {
        preOrder(root);
    }
}