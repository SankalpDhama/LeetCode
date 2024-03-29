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
    void insert(TreeNode root,TreeNode newNode){
        if(root.val>newNode.val){
            if(root.left==null){
                root.left=newNode;
            }else{
                insert(root.left,newNode);
            }
        }else{
             if(root.right==null){
                root.right=newNode;
            }else{
                insert(root.right,newNode);
            }
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode=new TreeNode(val);
        if(root==null){
            return newNode;
        }
        insert(root,newNode);
        return root;
    }
}