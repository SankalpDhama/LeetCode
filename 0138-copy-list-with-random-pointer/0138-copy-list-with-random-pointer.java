/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    
    public Node copyRandomList(Node head) {
        Node helperList=new Node(0);
        Node helperList2=new Node(400);
        Node curOriginal=head;
        Node cur=helperList;
        HashMap<Node,Node> randomMap=new HashMap<>();
        while(curOriginal!=null){
            cur.next=new Node(curOriginal.val);
            cur=cur.next;
            randomMap.put(curOriginal,cur);
            curOriginal=curOriginal.next;
        }
        cur.next=null;
        cur=helperList.next;
        curOriginal=head; 
        randomMap.put(null,null);
        while(cur!=null){            
            cur.random=randomMap.get(curOriginal.random)==null?null:randomMap.get(curOriginal.random);
            cur=cur.next;
            curOriginal=curOriginal.next;
        }
        // for(Node a: randomMap.keySet()){
        //     if(a==null){
        //         System.out.print("null ");
        //     }else{
        //     System.out.print(a.val+" ");                
        //     }
        // }
        // System.out.println();
        // for(Node a: randomMap.values()){
        //     if(a==null){
        //         System.out.print("null ");
        //     }else{                
        //     System.out.print(a.val+" ");
        //     }
        // }
        return helperList.next;
    }
}