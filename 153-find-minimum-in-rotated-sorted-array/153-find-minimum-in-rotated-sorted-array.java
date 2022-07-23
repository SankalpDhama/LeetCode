class Solution {
    public int findMin(int[] nums) {
        int size=nums.length;
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int min=nums[mid];
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[start]<=nums[mid]){            
                min=Math.min(min,nums[start]);
                start=mid+1;
            }else{
                min=Math.min(min,nums[mid]);
                end=mid-1;
            }
        }
        return min;
    }
}