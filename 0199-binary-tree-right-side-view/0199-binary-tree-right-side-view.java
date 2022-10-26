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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> auxQueue=new LinkedList<>();
        List<Integer> answer=new ArrayList<>();
        if(root==null){
            return answer;
        }
        auxQueue.offer(root);
        auxQueue.offer(null);
        while(!auxQueue.isEmpty()){
            TreeNode cur=auxQueue.poll();
            if(cur==null){
                if(auxQueue.isEmpty()){
                    break;
                }
                auxQueue.offer(cur);
                continue;
            }
            if(auxQueue.peek()==null){
                answer.add(cur.val);
            }
            if(cur.left!=null){
                auxQueue.offer(cur.left);
            }
            if(cur.right!=null){
                auxQueue.offer(cur.right);
            }
        }
        return answer;
    }
}