class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int size=nums.length;
        ArrayList<Integer> disappearList=new ArrayList<>();
        HashSet<Integer> disappearSet=new HashSet<>();
        for(int i=0;i<size;i++){
            if(disappearSet.contains(nums[i])){
                
            }else{
                disappearSet.add(nums[i]);
            }
        }
        for(int i=1;i<=size;i++){
            if(disappearSet.contains(i)){
                
            }else{
                disappearList.add(i);
            }
        }
        return disappearList;
    }
}