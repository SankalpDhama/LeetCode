class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }if(mid==0 && nums[mid]>target){
            return mid;
        }else if(mid==nums.length-1 && nums[mid]<target){
            return mid+1;
        }
        else if(nums[mid]>target && nums[mid-1]<target){
            return mid;
        }else if(nums[mid]<target && nums[mid+1]>target){
            return mid+1;
        }else{
            return mid;
        }
    }
}