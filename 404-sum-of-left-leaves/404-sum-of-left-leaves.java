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
    int leftSum(TreeNode root,boolean isLeft){
        if(root==null){
            return 0;
        }
        TreeNode left=root.left;
        TreeNode right=root.right;
        if(left==null && right==null && isLeft){
            return root.val;
        }if(left==null && right==null && !isLeft){
            return 0;
        }
        return leftSum(root.left,true)+leftSum(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return leftSum(root,false);
    }
}