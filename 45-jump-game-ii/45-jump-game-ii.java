class Solution {
    public int jump(int[] nums) {
        int size=nums.length;
        if(size<=1){
            return 0;
        }
        if(nums[0]==0){
            return -1;
        }
        int ladderReach=nums[0];
        int stepsTC=nums[0];
        int jumps=1;
        for(int i=1;i<size;i++){
            if(i==size-1){
                return jumps;
            }
            ladderReach=Math.max(ladderReach,nums[i]+i);
            stepsTC--;
            if(stepsTC==0){
                if(i==ladderReach){
                    return -1;
                }
                jumps++;
                stepsTC=ladderReach-i;
            }
        }
        return jumps;
    }
}