class Solution {
    public int maxSubArray(int[] nums) {
        int size=nums.length;
        if(size==1){
            return nums[0];
        }
        int curSum=0;
        int maxSum=nums[0];
        for(int i=0;i<size;i++){
            curSum+=nums[i];               
            maxSum=Math.max(maxSum,curSum);
            curSum=Math.max(curSum,0);
        }
        return maxSum;
    }
}