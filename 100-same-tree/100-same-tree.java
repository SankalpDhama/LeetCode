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
    boolean checkTree(TreeNode p,TreeNode q){        
        // if(p==null && q!=null){
        //     fl=false;
        //     return fl;
        // }
        // if(p!=null && q==null){
        //     fl=false;
        //     return fl;
        // }
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return (checkTree(p.left,q.left) && checkTree(p.right,q.right));
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checkTree(p,q);
    }
}