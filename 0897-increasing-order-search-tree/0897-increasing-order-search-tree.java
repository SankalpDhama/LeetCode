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
    void inOrder(TreeNode root,Queue<TreeNode> nodeQueue){
        if(root==null){
            return;
        }
        inOrder(root.left,nodeQueue);
        nodeQueue.offer(root);
        inOrder(root.right,nodeQueue);
    }
    
    public TreeNode increasingBST(TreeNode root) {
        if(root.left==null && root.right==null){
            return root;
        }
        Queue<TreeNode> nodeQueue=new LinkedList<>();
        inOrder(root,nodeQueue);
        root=nodeQueue.poll();
        TreeNode cur=root;
        while(!nodeQueue.isEmpty()){
            cur.right=nodeQueue.poll();
            cur.left=null;
            cur=cur.right;
        }
        cur.left=null;
        return root;
    }
}