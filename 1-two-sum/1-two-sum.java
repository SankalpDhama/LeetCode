class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> mapCheck=new HashMap<>();
        int[] answer=new int[2];
        int checker=0;
        for(int i=0;i<nums.length;i++){
            checker=target-nums[i];
            if(mapCheck.containsKey(checker)){
                answer[0]=mapCheck.get(checker);
                answer[1]=i;
                break;
            }else{
                mapCheck.put(nums[i],i);
            }
        }
        return answer;
    }
}