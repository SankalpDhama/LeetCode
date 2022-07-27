class Solution {
    public int majorityElement(int[] nums) {
        int size=nums.length;
        if(size==1){
            return nums[0];
        }
        int maxCount=0;
        int answer=0;
        HashMap<Integer,Integer> maj=new HashMap<>();
        for(int i=0;i<size;i++){
            int count=1;
            if(maj.containsKey(nums[i])){
                count=maj.get(nums[i]);
                maj.put(nums[i],++count);
                if(maxCount<count){
                    maxCount=count;
                    answer=nums[i];
                }
            }else{
                maj.put(nums[i],count);
                
            }
        }
        return answer;
    }
}