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
        if(root==null){
            return 0;
        }
        int max=0;
        for(int i=0;i<root.children.size();i++){
            int depth=max(root.children.get(i));
            if(depth>max){
                max=depth;
            }
        }
        return 1+max;
    }
    public int maxDepth(Node root) {
        return max(root);
    }
}