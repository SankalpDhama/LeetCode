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
    void inOrder(TreeNode root,List<Integer> ascendList){
        if(root==null){
            return;
        }
        inOrder(root.left,ascendList);
        ascendList.add(root.val);
        inOrder(root.right,ascendList);  
    }
    void merge(List<Integer> list1,List<Integer> list2,List<Integer> answerList){    
        int size1=list1.size();
        int size2=list2.size();
        int i=0;
        int j=0;        
        while(i<size1 && j<size2){
            int l1i=list1.get(i);
            int l2j=list2.get(j);
           // System.out.println(l1i+"list1");
           // System.out.println(l2j+"list1");            
            if(l2j<=l1i){
                //System.out.println("San");
                answerList.add(l2j);
                j++;
            }else if(l1i<l2j){
                //System.out.println("bheeesh");
                answerList.add(l1i);
                i++;
            }
        }
        if(i<size1){
            while(i<size1){
                int l1i=list1.get(i);
                answerList.add(l1i);
                i++;
            }
        }else if(j<size2){
            while(j<size2){
                int l2j=list2.get(j);
                answerList.add(l2j);
                j++;
            }
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> answerList=new ArrayList<>();
        inOrder(root1,list1);
        inOrder(root2,list2);
       // System.out.println(list1.toString());
        //System.out.println(list2.toString());
        merge(list1,list2,answerList);
        return answerList;
    }
}