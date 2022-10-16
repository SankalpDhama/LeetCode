/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;x
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
    boolean isSame(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }if(root==null || subRoot==null){
            return false;
        }if(root.val==subRoot.val){
            return (isSame(root.left,subRoot.left) && isSame(root.right,subRoot.right));            
        }else{
            return false;
        }
    }
    boolean traverse(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }if(root==null || subRoot==null){
            return false;
        }
        if(root.val==subRoot.val){
            return isSame(root,subRoot) || (traverse(root.left,subRoot) || traverse(root.right,subRoot));
        }
        return traverse(root.left,subRoot) || traverse(root.right,subRoot);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return traverse(root,subRoot);
    }
}