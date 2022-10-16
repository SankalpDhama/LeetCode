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
    TreeNode cur;
    void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        root.left=null;
        cur.right=root;
        cur=cur.right;
        inOrder(root.right);
    }
    
    public TreeNode increasingBST(TreeNode root) {
        if(root.left==null && root.right==null){
            return root;
        }
        TreeNode helper=new TreeNode(0);
        cur=helper;
        inOrder(root);
        return helper.right;
    }
}