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
    TreeNode getSuc(TreeNode root){
        TreeNode cur=root.right;
        while(cur!=null && cur.left!=null){
            cur=cur.left;
        }
        return cur;
    }
    TreeNode delete(TreeNode root,int key){
        if(root==null){
            return root;
        }
        if(root.val>key){
            root.left=delete(root.left,key);
        }else if(root.val<key){
            root.right=delete(root.right,key);
        }else{
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                TreeNode suc=getSuc(root);
                root.val=suc.val;
                root.right=delete(root.right,suc.val);
            }
            return root;
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root,key);
    }
}