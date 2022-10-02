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
    void preOrder(TreeNode root,LinkedList<TreeNode> answerList){
        if(root==null){
            return;
        }
        answerList.add(root);
        preOrder(root.left,answerList);
        preOrder(root.right,answerList);
    }
    public void flatten(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            return;
        }
        LinkedList<TreeNode> answerList=new LinkedList<>();
        preOrder(root,answerList);
        int i=0;
        while(answerList.size()!=i){
            root.right=answerList.get(i);
            root.left=null;
            root=root.right;
            i++;
        }
    }
}