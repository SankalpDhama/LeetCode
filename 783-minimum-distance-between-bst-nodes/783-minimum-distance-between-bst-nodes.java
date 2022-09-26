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
    int minDiff(int minimumDiff,TreeNode root,ArrayList<Integer> allNodes){
        int size=allNodes.size();
        int val=root.val;
        for(int i=0;i<size;i++){
            int diff=Math.abs(val-allNodes.get(i));
            if(diff<minimumDiff){
                minimumDiff=diff;
                }
            }
        allNodes.add(val);
        if(root.left==null && root.right==null){
            return minimumDiff;
        }
        if(root.left==null && root.right!=null){
            return minDiff(minimumDiff,root.right,allNodes);
        }if(root.right==null && root.left!=null){
            return minDiff(minimumDiff,root.left,allNodes);
        }
        return Math.min(minDiff(minimumDiff,root.left,allNodes),minDiff(minimumDiff,root.right,allNodes));
    }
    public int minDiffInBST(TreeNode root) {
        int minimumDiff=Integer.MAX_VALUE;
        ArrayList<Integer> allNodes=new ArrayList<>();
        return minDiff(minimumDiff,root,allNodes);
    }
}