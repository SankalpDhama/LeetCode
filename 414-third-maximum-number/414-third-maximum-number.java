class Solution {
    public int thirdMax(int[] nums) {
        int size=nums.length;
        Long firstMax=Long.MIN_VALUE;
        Long secMax=Long.MIN_VALUE;
        Long thMax=Long.MIN_VALUE;
        for(int i=0;i<size;i++){
           if(nums[i]>firstMax){
               thMax=secMax;
               secMax=firstMax;
               firstMax=Long.valueOf(nums[i]);
           }else if(nums[i]>secMax && nums[i]!=firstMax){
               thMax=secMax;
               secMax=Long.valueOf(nums[i]);
           }else if(nums[i]>thMax && nums[i]!=firstMax && nums[i]!=secMax){
               thMax=Long.valueOf(nums[i]);
           }
        }
        if(thMax==Long.MIN_VALUE){
            return firstMax.intValue();
        }
        else{            
        return thMax.intValue();
        }
    }
}