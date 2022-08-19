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
    int minimumDepth(TreeNode root){        
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right!=null){
            return (1+minimumDepth(root.right));
        } if(root.left!=null && root.right==null){
            return (1+minimumDepth(root.left));
        }
        return (1+Math.min(minimumDepth(root.left),minimumDepth(root.right)));
    }
    public int minDepth(TreeNode root) {
        return minimumDepth(root);
    }
}