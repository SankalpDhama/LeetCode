/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        int noOfNode=0;
        int iterate=0;
        int check=1;
        Queue<Node> levelQueue=new LinkedList<>();
        levelQueue.offer(root);
        while(!levelQueue.isEmpty()){
            Node cur=levelQueue.poll();
            noOfNode++;
            if(noOfNode==check){
                iterate++;
                check+=Math.pow(2,iterate);
                cur.next=null; 
            }else{
                cur.next=levelQueue.peek();
            }
            if(cur.left!=null){
                levelQueue.offer(cur.left);
            }
            if(cur.right!=null){
                levelQueue.offer(cur.right);
            }            
        }
        return root;
    }
}