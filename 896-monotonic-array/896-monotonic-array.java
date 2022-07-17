class Solution {
    public boolean isMonotonic(int[] nums) {
        int size=nums.length;
        int a=0;
        if(nums[0]-nums[size-1]>=0){
            a=1;
        }else{
            a=-1;
        }
        for(int i=1;i<size;i++){
            int diff=nums[i-1]-nums[i];
            if(diff*a>=0){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}