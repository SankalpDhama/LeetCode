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
    // void preOrder(TreeNode root){
    //     ArrayList<Integer> list=new ArrayList<>();
    //     if(root==null){
    //         return;
    //     }
    //     list.add(root.val);
    //     preOrder(root.left);
    //     preOrder(root.right);   
    // }
    ArrayList<Integer> list=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return list;            
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}