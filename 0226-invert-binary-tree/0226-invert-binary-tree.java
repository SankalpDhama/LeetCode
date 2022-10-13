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
    void invert(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null || root.right!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
        //System.out.println(newTree.left.val+"leftval");
        //System.out.println(newTree.right.val+"rightval");        
        invert(root.right);
        invert(root.left);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        invert(root);
        return root;
    }
}