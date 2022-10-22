/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
   
    void levelOrder(Node root,Queue<Node> auxQueue,List<List<Integer>> answerList){
        auxQueue.offer(root);
        auxQueue.offer(null);
        List<Integer> levelList=new ArrayList<>();
        while(!auxQueue.isEmpty() ){
            Node temp=auxQueue.poll();
            if(temp==null){
                answerList.add(levelList);
                if(auxQueue.isEmpty()){
                    break;
                }
                auxQueue.offer(temp);
                levelList=new ArrayList<>();
                continue;
            }else{
                levelList.add(temp.val);   
            }
            for(int i=0;i<temp.children.size();i++){
                auxQueue.offer(temp.children.get(i));
            }
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> answerList=new ArrayList<>();
        if(root==null){
            return answerList;   
        }
        Queue<Node> auxQueue=new LinkedList<>();
        levelOrder(root,auxQueue,answerList);
        return answerList;
    }
}