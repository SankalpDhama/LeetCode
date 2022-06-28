class Solution {
    public int thirdMax(int[] nums) {
        int size=nums.length;
        long firstMax=Long.MIN_VALUE;
        long secMax=Long.MIN_VALUE;
        long thMax=Long.MIN_VALUE;
        for(int i=0;i<size;i++){
           if(nums[i]>firstMax){
               thMax=secMax;
               secMax=firstMax;
               firstMax=nums[i];
           }else if(nums[i]>secMax && nums[i]!=firstMax){
               thMax=secMax;
               secMax=nums[i];
           }else if(nums[i]>thMax && nums[i]!=firstMax && nums[i]!=secMax){
               thMax=nums[i];
           }
        }
        if(thMax==Long.MIN_VALUE){
            return (int)firstMax;
        }
        else{            
        return (int)thMax;
        }
    }
}