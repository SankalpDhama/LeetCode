class Solution {
    int binaryLeft(int nums[],int target){
        if(nums[0]==target){
            return 0;
        }
        int start=1;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target && nums[mid-1]!=target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]==target && nums[mid-1]==target){
                end=mid-1;
            }
        }
        return -1;
    }
    int binaryRight(int nums[],int target){
        if(nums[nums.length-1]==target){
            return (nums.length-1);
        }
        int start=0;
        int end=nums.length-2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target && nums[mid+1]!=target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]==target && nums[mid+1]==target){
                start=mid+1;
            }
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[] {-1,-1};
        }
        // int left=binaryLeft(nums,target);
        // int right=binaryRight(nums,target);
        return new int[] {binaryLeft(nums,target),binaryRight(nums,target)};
    }
}