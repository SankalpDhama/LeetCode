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
    boolean recurSum(TreeNode root,int sum,int targetSum,boolean flag){
        if(root==null){
            return flag;
        }
        if(root.left==null && root.right==null){
            sum=root.val+sum;
            if(sum==targetSum || flag){
            flag=true;
            }
            return flag;
        }
        flag=recurSum(root.left,sum+root.val,targetSum,flag);
        flag=recurSum(root.right,sum+root.val,targetSum,flag);
        return flag;
    }
    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root==null){
            return false;
        }
        return recurSum(root,0,targetSum,false);
    }
}