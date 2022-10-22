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
    void postOrder(Node root,List<Integer> answerList){
        int size=root.children.size();
        for(int i=0;i<size;i++){
            postOrder(root.children.get(i),answerList);
        }
        answerList.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> answerList=new ArrayList<>();
        if(root==null){
            return answerList;
        }
        postOrder(root,answerList);
        return answerList;
    }
}