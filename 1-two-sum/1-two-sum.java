class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> mapCheck=new HashMap<>();
        int checker=0;
        int i=0;
        for(i=0;i<nums.length;i++){
            checker=target-nums[i];
            if(mapCheck.containsKey(checker)){
               // return new int[] {mapCheck.get(checker),i};
                break;
            }else{
                mapCheck.put(nums[i],i);
            }
        }
        return new int[] {mapCheck.get(checker),i};
    }
}