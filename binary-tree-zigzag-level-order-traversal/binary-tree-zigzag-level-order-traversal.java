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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList();
        q.offer(root);        
        q.offer(null);
        boolean right=false;
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(cur==null){
                    if(right){
                        Collections.reverse(arr);
                    }
                    ans.add(arr);
                    arr=new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(cur);
                    cur=q.poll();
                }                
                right=!right;              
            }
            arr.add(cur.val);
            if(cur.left!=null){
                q.offer(cur.left);
            }
            if(cur.right!=null){
                q.offer(cur.right);
            }
        }    
        return ans;
    } 
}