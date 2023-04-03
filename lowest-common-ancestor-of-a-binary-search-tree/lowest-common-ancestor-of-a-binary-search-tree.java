/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode traverse(TreeNode root,TreeNode p,TreeNode q){
        if(root==p || root==q){
            return root==p?p:q;
        }if(root==null){
            return null;
        }
        TreeNode left=traverse(root.left,p,q);
        TreeNode right=traverse(root.right,p,q);
        if(left==null || right==null){
            return left==null?right:left;
        }else{
            return root;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return traverse(root,p,q);
    }
}