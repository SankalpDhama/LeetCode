class Solution {
    public int thirdMax(int[] nums) {
        int size=nums.length;
        int firstMax=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        Long thMax=Long.MIN_VALUE;
        for(int i=0;i<size;i++){
            firstMax=Math.max(firstMax,nums[i]);
        }
        for(int i=0;i<size;i++){
            if(nums[i]!=firstMax){
                secMax=Math.max(secMax,nums[i]);
            }
        }
        for(int i=0;i<size;i++){
            if(nums[i]<secMax){
                thMax=Math.max(thMax,nums[i]);
            }
        }
        if(thMax==Long.MIN_VALUE){
            return firstMax;
        }
        else{
        return thMax.intValue();}
    }
}