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
    void preOrder(Node root,List<Integer> answerList){
        int size=root.children.size();
        //System.out.println(size);
        answerList.add(root.val);
        for(int i=0;i<size;i++){
            if(root==null){
                continue;
            }
            preOrder(root.children.get(i),answerList);
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> answerList=new ArrayList<>();
        if(root==null){
            return answerList;
        }
        preOrder(root,answerList);
        return answerList;
    }
}