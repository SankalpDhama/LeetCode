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
    int max(Node root){
        int max=0;
        Queue<Node> auxQueue=new LinkedList<>();
        auxQueue.offer(root);
        auxQueue.offer(null);
        while(!auxQueue.isEmpty()){
            Node temp=auxQueue.poll();
            if(temp==null){
                max++;
                if(auxQueue.isEmpty()){
                    break;
                }
                auxQueue.offer(temp);
                continue;
            }
            int size=temp.children.size();
            for(int i=0;i<size;i++){
                auxQueue.offer(temp.children.get(i));
            }
        }
        return max;
    }
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
       return max(root);
    }
}