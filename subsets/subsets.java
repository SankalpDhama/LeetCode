class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void subs(int[] nums,int index,List<Integer> curList){
        int size=nums.length;
        if(index==size){
            ans.add(new ArrayList<>(curList));
            return;            
        }
        curList.add(nums[index]);
        subs(nums,++index,curList);
        curList.remove(curList.size()-1);
        subs(nums,index,curList);
    }
    public List<List<Integer>> subsets(int[] nums) {  
        List<Integer> curList=new ArrayList<>();
        subs(nums,0,curList);
        return ans;
    }
}