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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    if(root==null){
            List<List<Integer>> nullList=new ArrayList<>();
            return nullList;
        }
        //ZsHashMap<Integer,ArrayList<Integer>> map =new HashMap<>();
        int height=0;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> list=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode cur=q.remove();
            if(cur==null){
                if(q.isEmpty()){
                ArrayList<Integer> heightList=new ArrayList<>(list);
                map.put(height++,heightList);
                continue;  
                }else{             
                q.add(null);
                ArrayList<Integer> heightList=new ArrayList<>(list);
                map.put(height++,heightList);
                list.clear();
                continue;
                }              
            }
            //System.out.println(cur.val);
            list.add(cur.val);
           // System.out.println("bheesh");
           // System.out.println(list.toString());
            if(cur.left!=null){
                q.add(cur.left);
                //list.add(cur.left.val);
            }
            if(cur.right!=null){
                q.add(cur.right);
                //list.add(cur.right.val);
            }
        }
        //System.out.println("bheeesh")
        //System.out.println(map.toString());
        List<List<Integer>> answerList=new ArrayList<>();
        for(int i=height-1;i>=0;i--){
            //System.out.println("bheesh");
            answerList.add(map.get(i));
        }
        return answerList;
    }
}