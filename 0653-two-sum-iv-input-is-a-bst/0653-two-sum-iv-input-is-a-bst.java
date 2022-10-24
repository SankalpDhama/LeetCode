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
    boolean twoSum(TreeNode root,int k,HashSet<Integer> auxSet){
        if(root==null){
            return false;
        }
        int checker=k-root.val;
        if(auxSet.contains(checker)){
            return true;
        }
        auxSet.add(root.val);
        return (twoSum(root.left,k,auxSet) || twoSum(root.right,k,auxSet));
    }
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> auxSet=new HashSet<>();
        return twoSum(root,k,auxSet);
    }
}